package util;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.admin.AdminAware;


public class InterceptorAutAdmin implements Interceptor {


	private static final long serialVersionUID = 1L;

	private static final Logger logger = LogManager.getLogger("Interceptor");

	public void destroy() {
	}
	public void init() {
	}

	public String intercept( ActionInvocation actionInvocation ) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		logger.info("Ongoing authentication!");
		Object aut=session.get("user");

		if (aut == null||aut.getClass().getName().equals("it.unirc.pojo.customer.Customer")) {
			return Action.LOGIN;
		} 

		Admin a=(Admin)aut;
		Action action = ( Action ) actionInvocation.getAction();

		if (action instanceof AdminAware) {
			((AdminAware)action).setAdmin(a);
		}
		return actionInvocation.invoke();
	
}


}

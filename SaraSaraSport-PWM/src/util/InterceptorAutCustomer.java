package util;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import it.unirc.pojo.customer.Customer;
import it.unirc.pojo.customer.CustomerAware;

public class InterceptorAutCustomer implements Interceptor {
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
		
		if (aut == null||aut.getClass().getName().equals("it.unirc.pojo.admin.Admin")) {
		    return Action.LOGIN;
		} 

			Customer c=(Customer)aut;
		    Action action = ( Action ) actionInvocation.getAction();
		    
		    if (action instanceof CustomerAware) {
		        ((CustomerAware)action).setCustomer(c);
		    }
		    return actionInvocation.invoke();
		}

}

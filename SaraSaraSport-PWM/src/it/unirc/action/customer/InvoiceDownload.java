package it.unirc.action.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class InvoiceDownload extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InputStream fileInputStream;
	String number;
	String year;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public String execute() throws Exception {
		String path=ServletActionContext.getServletContext().getRealPath("/")+"\\WebContent\\File\\Invoices\\Invoice"+number+year+".pdf";
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\", "");
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "");
		fileInputStream = new FileInputStream(new File(path));
		return SUCCESS;
	}
}


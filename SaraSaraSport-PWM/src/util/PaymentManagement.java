package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PaymentManagement {
	

	public static synchronized double readCardBalance(String path) {
		path=path+"\\WebContent\\File\\PaymentManagement\\PaymentManagement.txt";
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "");
		path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\", "");
		BufferedReader b;
		FileReader f;

		try {
			f= new FileReader(path);
			b=new BufferedReader(f);
			double balance= Double.parseDouble(b.readLine());
			b.close();

			return balance;
		} catch (Exception e) {

			e.printStackTrace();
			return -1;
		}
	}
	public static synchronized double incrementCardBalance(double value,String path)  {
		double old=readCardBalance(path);
		if(old==-1) return -1;

		Double amount= old+value;
		FileWriter w;
		try {
			path=path+"\\WebContent\\File\\PaymentManagement\\PaymentManagement.txt";
			path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "");
			path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\", "");
			w=new FileWriter(path);
			w.write(amount.toString());
			w.close();
		} catch (IOException e) {

			e.printStackTrace();
			return -1;
		}


		return amount;
	}

	public static synchronized double decrementCardBalance(double value,String path)  {
		double old=readCardBalance(path);
		if(old==-1) return -1;

		Double amount= old-value;
		if(amount<0) return -1;
		FileWriter w;
		try {
			path=path+"\\WebContent\\File\\PaymentManagement\\PaymentManagement.txt";
			path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\", "");
			path=path.replace(".metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\", "");
			w=new FileWriter(path);
			w.write(amount.toString());
			w.close();
		} catch (IOException e) {

			e.printStackTrace();
			return -1;
		}


		return amount;
	}	




}











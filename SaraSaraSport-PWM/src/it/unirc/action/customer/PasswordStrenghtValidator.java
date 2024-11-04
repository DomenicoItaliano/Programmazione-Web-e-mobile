package it.unirc.action.customer;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PasswordStrenghtValidator  extends FieldValidatorSupport {
	/*
	 * Pattern è un tipo Java per gestire le espressioni regolari.
	 * Vedi [http://download.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html]
	 */
	static Pattern uppercase = Pattern.compile("[A-Z]");
	static Pattern lowercase = Pattern.compile("[a-z]");
	static Pattern numbers = Pattern.compile("[0-9]");

	@Override
	public void validate(Object arg0) throws ValidationException {
		/*
		 * getFieldValue() prende due parametri:
		 * 	name: il nome del campo
		 *  object: l'oggetto form, lo stesso che viene passato al metodo validate()
		 */
		String inputPassword = (String) this.getFieldValue(this.getFieldName(), arg0);

		System.out.println("-- "+inputPassword);
		Boolean passContainsLowercase = lowercase.matcher(inputPassword).find();
		Boolean passContainsUppercase = uppercase.matcher(inputPassword).find();
		Boolean passContainsNumbers = numbers.matcher(inputPassword).find();

		if(!passContainsLowercase||!passContainsUppercase||!passContainsNumbers){
			addFieldError(getFieldName(), arg0);
		}
	}
}

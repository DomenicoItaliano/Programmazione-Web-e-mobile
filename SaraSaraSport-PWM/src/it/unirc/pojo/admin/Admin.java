package it.unirc.pojo.admin;

public class Admin {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [idAdmin=" + idAdmin + ", name=" + name + ", cognome=" + surname + ", username=" + username
				+ ", password=" + password + ", email=" + email + "]";
	}
	private int idAdmin;
	private String name;
	private String surname;
	private String username;
	private String password;
	private String email;
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Admin(int idAdmin, String name, String surname, String username, String password, String email) {
		super();
		this.idAdmin = idAdmin;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.email = email;
	}


}
package it.unirc.pojo.admin;

import java.util.List;



public interface AdminDAO {
	public Admin getAdmin(Admin a);
	public boolean insertAdmin(Admin a);
	public boolean editAdmin(Admin a);
	public boolean deleteAdmin(Admin a);
	public Admin getAdminByUsername(Admin a);
	public List<Admin> getAdmins();
}
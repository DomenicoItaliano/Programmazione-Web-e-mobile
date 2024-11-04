package it.unirc.action.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pojo.item.ItemDAO;
import it.unirc.pojo.item.ItemDAOFactory;
import it.unirc.pojo.admin.Admin;
import it.unirc.pojo.item.Uniform;

public class InsertItemUniform extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;

	Uniform item=new Uniform();

	private Map<String, Object> session;


	private String name;
	private String img;
	private String description;
	private double price;
	private int stockQuantity;
	private String category;
	private String measure;
	private ItemDAO p_dao=ItemDAOFactory.getDAO();
	private File image;
	private String imageContentType;
	private String imageFileName;

	Admin a=new Admin();



	public void setSession(Map<String, Object> session) {
		this.session=session;

	}


	public Admin getA() {
		return a;
	}


	public void setA(Admin a) {
		this.a = a;
	}




	public Uniform getItem() {
		return item;
	}


	public void setItem(Uniform item) {
		this.item = item;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getstockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	

	public String getMeasure() {
		return measure;
	}


	public void setMeasure(String measure) {
		this.measure = measure;
	}


	public ItemDAO getP_dao() {
		return p_dao;
	}


	public void setP_dao(ItemDAO p_dao) {
		this.p_dao = p_dao;
	}


	public File getImage() {
		return image;
	}


	public void setImage(File image) {
		this.image = image;
	}


	public String getImageContentType() {
		return imageContentType;
	}


	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}


	public String getImageFileName() {
		return imageFileName;
	}


	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}





	public String execute() throws Exception {
		a = (Admin)session.get("user");
		item.setName(getName());
		ServletContext context=ServletActionContext.getServletContext();
		String path=context.getRealPath("/SaraSaraSport-PWM/assets/img/");
		File parentDir=new File(path);
		if(!parentDir.exists())
			parentDir.mkdirs();
		File saved=new File(parentDir,getImageFileName());
		InputStream input=new FileInputStream(getImage());
		Files.copy(input, saved.toPath(), StandardCopyOption.REPLACE_EXISTING);
		String path1=("assets/img/item");
		int id=p_dao.maxStockQuantity()+1;
		item.setImg(path1+id+".jpg");
		item.setDescription(getDescription());
		item.setPrice(getPrice());
		item.setStockQuantity(getstockQuantity());
		item.setCategory(getCategory());
		item.setMeasure(getMeasure());
		item.setAdmin((Admin)session.get("user"));
		if(p_dao.insertItem(item)){
			return SUCCESS;
		}else{return INPUT;
		}
	}

	public void validate(){
		if(getImage()==null)this.addFieldError("image", "you have not selected any images");

	}


}

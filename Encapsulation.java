package projectj;
class V{
	private int id;
	private String password;      //to hide the details for privacy 
	
	public int getId() {
		return id;					//getter  ,,  setter 
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class Encapsulation {			//binding the data

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V obj=new V();
		obj.setId(118);
		obj.setPassword("coder10");
		System.out.println(obj.getId());
		System.out.println(obj.getPassword());
	}

}

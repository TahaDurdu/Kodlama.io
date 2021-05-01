
public class User {

	public User(int id,String userName,String Passaword) {
		
		this.id=id;
		this.Passaword=Passaword;
		this.userName=userName;
		
	}
	public User() {
		
	}
	private int id;
	private String userName;
	private String Passaword;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassaword() {
		return Passaword;
	}
	public void setPassaword(String passaword) {
		Passaword = passaword;
	}
	
}

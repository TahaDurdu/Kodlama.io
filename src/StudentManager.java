
public class StudentManager extends UserManager {
	
	public void register(User user) {
		System.out.println(user.getUserName()+"��renci Olarak Kay�t Yapt�n�z");
	}
	public void login(User user) {
		System.out.println(user.getUserName()+"��renci Olarak Giri� Yapt�n�z");
	}
	

}

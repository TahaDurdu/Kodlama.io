
public class StudentManager extends UserManager {
	
	public void register(User user) {
		System.out.println(user.getUserName()+"Öðrenci Olarak Kayýt Yaptýnýz");
	}
	public void login(User user) {
		System.out.println(user.getUserName()+"Öðrenci Olarak Giriþ Yaptýnýz");
	}
	

}

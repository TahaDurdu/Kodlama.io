
public class InstructorManager extends UserManager  {

	public void login(User user) {
		System.out.println(user.getUserName()+"Eðitmen Olarak Girildi");
		
	}
	public void register(User user) {
		System.out.println(user.getUserName()+"Eðitmen Olarak Kayýt Oldunuz");
	}

	public void  Remove(User user) {
		System.out.println(user.getUserName()+"Kullanýcýsý Silindi");
		
	}
	public void Update(User user) {
		System.out.println(user.getUserName()+"Kullanýcý Güncellendi");
		
	}
	
	
}

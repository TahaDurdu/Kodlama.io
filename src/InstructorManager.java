
public class InstructorManager extends UserManager  {

	public void login(User user) {
		System.out.println(user.getUserName()+"E�itmen Olarak Girildi");
		
	}
	public void register(User user) {
		System.out.println(user.getUserName()+"E�itmen Olarak Kay�t Oldunuz");
	}

	public void  Remove(User user) {
		System.out.println(user.getUserName()+"Kullan�c�s� Silindi");
		
	}
	public void Update(User user) {
		System.out.println(user.getUserName()+"Kullan�c� G�ncellendi");
		
	}
	
	
}

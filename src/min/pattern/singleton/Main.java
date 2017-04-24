package min.pattern.singleton;

public class Main {

	private static final int User_num = 5;
	
	public static void main(String[] args) {

		User[] user = new User[User_num];
		for(int i = 0; i<User_num; i++){
			
			user[i] = new User((i+1)+ "-user");
			user[i].start();
			
		}
		
		
	}

}

package min.pattern.singleton;

public class User extends Thread{

	private String name;

	public User(String name) {
		this.name = name;
	}
	
	public void run(){
		
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using "+ printer.toString()+".");
		
	}
}

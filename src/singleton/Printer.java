package singleton;

public class Printer {

	int counter = 0;
	
	private static class singleton{
		
		private static final Printer instance = new Printer();
		
	}
	
	public static Printer getPrinter(){
		return singleton.instance;
	}
	
	public void print(String str){
		synchronized (this) {
			counter++;
			System.out.println(str+counter);
		}
		
	}
}

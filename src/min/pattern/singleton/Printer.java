package min.pattern.singleton;

public class Printer {

	int counter = 0;
	
	private static class singleton{
		//클래스의 로드 시점은 싱글레톤 클래스를 호출할 때다. 이는 프린터 클래스의 로드 시점과는 다르다.
		//초기화의 부담을 분산 시키는 효과. 
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

package min.pattern.state;

public class OFF implements State {

	private static OFF off = new OFF();
	
	public static OFF getInstance(){
		
		return off;
		
	}
	
	
	@Override
	public void on_button_pushed(Light light) {

		light.setState(getInstance());
		System.out.println("Light ON");
	}

	@Override
	public void off_button_pushed(Light light) {

		System.out.println("반응 없음");
	}

}

package min.pattern.decorator;

public abstract class DisplayDecorator extends Display{

	private Display DeprecatedDisplay;
	
	public DisplayDecorator(Display deprecatedDisplay) {
		DeprecatedDisplay = deprecatedDisplay;
	}

	public void draw(){
		
		DeprecatedDisplay.draw();
	}
	
}

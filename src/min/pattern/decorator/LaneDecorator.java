package min.pattern.decorator;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display deprecatedDisplay) {
		super(deprecatedDisplay);
	
	}

	public void drawLane(){
		System.out.println("차선 표시");
	}
	
	public void draw(){
		super.draw();
		drawLane();
	}
	
}

package min.pattern.decorator;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display deprecatedDisplay) {
		super(deprecatedDisplay);
	}

	public void drawTraffic(){
		System.out.println("교통량 표시");
	}
	
	public void draw(){
		super.draw();
		drawTraffic();
	}
	
}

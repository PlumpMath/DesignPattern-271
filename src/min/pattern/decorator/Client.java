package min.pattern.decorator;

public class Client {

	public static void main(String[] args) {

		Display road = new RoadDisplay();
		road.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
		
	}

}

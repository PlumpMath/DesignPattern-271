package min.pattern.command;

public class Client {

	public static void main(String[] args) {
		
		/*Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Command lampOffCommand = new LampOffCommand(lamp);
		
		Button button1 = new Button(lampOnCommand);
		button1.pressed();
		
		button1.setCommand(lampOffCommand);
		button1.pressed();*/
		
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Command lampOffCommand = new LampOffCommand(lamp);
		
		Button button1 = new Button(lampOnCommand);
		button1.pressed();
		
		button1.setCommand(lampOffCommand);
		button1.pressed();
		
	}
	
}

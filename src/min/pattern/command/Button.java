package min.pattern.command;

public class Button {
	//호출자인 버튼 클래스는 직접 램프온오프를 요구하지 않고
	//커맨드 인터페이스를 만들어 커맨드 실행을 요구한다.
	//이를 통해 실제 기능을 수행하는 수신자 클래스와 의존성을 제거해
	//실행될 기능의 변경에도 호출자 클래스는 수정 없이 그대로 사용할 수 있다. 

/*	private Command theCommand;
	
	public Button(Command theCommand){
		setCommand(theCommand);
	}
	
	public void setCommand(Command newCommand){
		this.theCommand = newCommand;
	}
	
	public void pressed(){
		theCommand.execute();
	}*/
	
	private Command theCommand;
	
	public Button(Command theCommand){
		
		this.theCommand = theCommand;
	}

	public void setCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed(){
		theCommand.execute();
	}
	
	
}

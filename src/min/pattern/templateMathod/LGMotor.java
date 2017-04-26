package min.pattern.templateMathod;

public class LGMotor extends Motor {

	public LGMotor(Door door){
		super(door);
	}
	
	protected void moveMotor(Direction direction){
		System.out.println("LG모터 구동됨");
	}
	
}

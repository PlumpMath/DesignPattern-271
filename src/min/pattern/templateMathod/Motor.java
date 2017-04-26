package min.pattern.templateMathod;

public abstract class Motor {

	private Door door;
	private MotorStatus motorStatus;
	
	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}
	
	public MotorStatus getMotorStatus(){
		return motorStatus;
	}

	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	//현대와 lg모터의 move메서드에서 공통되는 부분만을 가짐
	public void move(Direction direction){
		
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED);
		door.close();
		
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
		
	}
	
	protected abstract void moveMotor(Direction direction);
	
}

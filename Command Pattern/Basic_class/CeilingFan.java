package Basic_class;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(location+"高速运转！");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(location+"中速运转！");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(location+"低速运转！");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location+"停止！");
	}
	
	public int getSpeed() {
		return speed;
	}
}

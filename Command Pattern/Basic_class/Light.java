package Basic_class;

public class Light {
	
	StringBuffer room = new StringBuffer();
	
	
	public Light() {
		//string.append(str);
	}
	
	public Light(String str) {
		room.append(str);
	}

	public void on() {
		// TODO Auto-generated method stub
		System.out.println(room+"的灯打开!");
	}
	
	public void off() {
		System.out.println(room+"的灯关闭!");
	}
	
}

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
		System.out.println(room+"�ĵƴ�!");
	}
	
	public void off() {
		System.out.println(room+"�ĵƹر�!");
	}
	
}

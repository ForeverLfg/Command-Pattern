package Basic_class;

public class GarageDoor {
	
	StringBuffer string = new StringBuffer();
	public GarageDoor() {
		//string.append(str);
	}
	
	public GarageDoor(String str) {
		string.append(str);
	}

	public void up() {
		// TODO Auto-generated method stub
		System.out.println(string+"���Ŵ򿪣�");
	}
	
	public void close() {
		System.out.println(string+"���Źرգ�");
	}
}

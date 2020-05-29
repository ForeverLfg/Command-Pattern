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
		System.out.println(string+"的门打开！");
	}
	
	public void close() {
		System.out.println(string+"的门关闭！");
	}
}

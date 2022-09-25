
public interface Demo1 {
void display();
}
Class DemoTest implements Demo1{
	public void display() {
		System.out.println("display");
	}
	public static void main (String[]args) {
		DemoTest ob=new DemoTest();
		ob.display();
		
	}
}
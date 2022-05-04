package Learn;

public class MethodOverloading {

	public void getData(int a) {
		System.out.println(a);
	}
	public void getData(String b) {
			System.out.println(b);
		}
	public void getData(int a, int b) {
		System.out.println(a + " " +b);
	}
	public static void main (String[] args) {
		MethodOverloading md = new MethodOverloading();
		md.getData("Hello");
		md.getData(9);
		String c="selenium";
		System.out.println(c.substring(3));
		System.out.println(c.substring(2, 6));
		md.getData(2, 8);
		}
	
	
}

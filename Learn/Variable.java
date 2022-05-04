package Learn;

public class Variable {
int a=7;
	public String Geek;
	public Variable() {
		//this.Geek="Niresh";
	}
	String name="Niresh";
	
	public void companyDetails() {
		
		String cpyName="TestLeaf";
		String Address="abc address";
		int Pincode=60000;
		System.out.println(cpyName);
		System.out.println(Address);
		System.out.println(Pincode);
	}
	
	public void student() {
		
		String name="Niresh";
		System.out.println(name);
	}
	public void student2() {
		
		String name="Deepika";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Variable details= new Variable();
		System.out.println("Student No.1");
		details.student();
		details.companyDetails();
		System.out.println("********");
		
		System.out.println("Student No.2");
		details.student2();
		details.companyDetails();
		System.out.println("********");
		System.out.println(details.a);
		
		SecondClass sn= new SecondClass();
		sn.setData();
		                                
		
		
		
	}
}

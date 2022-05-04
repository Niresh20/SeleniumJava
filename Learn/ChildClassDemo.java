package Learn;

public class ChildClassDemo extends ParentClassDemo {
	public void soundSystem() {
		System.out.println("Sound system implemented");
	}
public void color() {
	System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd= new ChildClassDemo();
		cd.gear();
		cd.brakes();
		cd.soundSystem();
		cd.color();
	}

}

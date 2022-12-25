package actualformaldemo;

public class drivercls {
	void display(String str) {
		System.out.println("MESSAGE FROM ACTUAL PARAMETERIS : "+ str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "jaya";
		drivercls d;
		d= new drivercls();
		d.display(name);

	}

}

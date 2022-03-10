
public class Employee {
	private static final int iSPresent = 1;

	public static void main(String[] args) {
		int empCheck = (int) Math.floor((Math.random()*10)%2);
		System.out.println(empCheck);
		if(empCheck == iSPresent) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is Absent");
		}
		}
}

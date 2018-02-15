package JenkinsJobFeb15.HelloJenkins;

public class SampleApplication {
	static int empId;
	static int age;
	static double salary;
	static double vpay;

	public static void main(String[] args) {
		// SampleApplication s= new SampleApplication();
		SampleApplication.empId = 17;
		SampleApplication.age = 30;
		SampleApplication.salary = 50000.15;
		SampleApplication.vpay = 20000.25;
		System.out.println("Emploee Id" + empId);
		System.out.println("Emploee age" + age);
		System.out.println("Emploee salary" + salary);
		System.out.println("Emploee variable pay" + vpay);
	}
}

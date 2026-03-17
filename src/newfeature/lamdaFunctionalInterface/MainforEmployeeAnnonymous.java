package newfeature.lamdaFunctionalInterface;

public class MainforEmployeeAnnonymous {

	public static void main(String[] args) {
		EmploeeforAnnonymous emp = new EmploeeforAnnonymous() {

			@Override
			public String getSalary() {
				// TODO Auto-generated method stub
				return "100";
			}

			@Override
			public String getDesignation() {
				// TODO Auto-generated method stub
				return "software Engineer";
			}

		};
		System.out.println(emp.getSalary()); //100
	}

}

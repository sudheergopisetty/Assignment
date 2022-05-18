
public class MainDemo {

	public static void main(String[] args) {
		Department dept1= new Department();
		Department dept2= new Department();
		
		dept1.setDeptId(10);
		dept1.setDeptName("FlipKart");
		dept2.setDeptId(10);
		dept2.setDeptName("FlipKart");
		
		if (dept1.getDeptId() == dept2.getDeptId() && dept1.getDeptName() == dept2.getDeptName()) {
			System.out.println("Please change name and id as they are same");
		} else {
			System.out.println("All are valid data");
		}
		
		dept1= null;
		dept2= null;
	}

}
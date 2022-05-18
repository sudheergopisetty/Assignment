class StudentApp {
	public static void main( String[] args) {
		Student stud1 = new Student();
		
		stud1.studentId= 12;
		stud1.studentName= "Mohan Murali Rao";
		stud1.studentRank= 88828233;

		System.out.println(stud1.studentId);
		System.out.println(stud1.studentName);
		System.out.println(stud1.studentRank);

		stud1= null;
	}
	
}
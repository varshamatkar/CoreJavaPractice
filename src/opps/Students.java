package opps;

public class Students {
	
private	int id;
private String studentName;

	

public Students(int id, String studentName) {
	
	this.id = id;
	this.studentName = studentName;
}


public int getId() {
		return id;
	}

public void setId(int id) {
		this.id = id;
	}


public String getStudentName() {
		return studentName;
	}

public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


public static void main(String[] args) {
		
	Students s= new Students(1, "Sushant");
	
	System.out.println(s.getId());
	System.out.println(s.getStudentName());
	
	s.setStudentName("Varsha");
	System.out.println(s.getStudentName());

	}

}

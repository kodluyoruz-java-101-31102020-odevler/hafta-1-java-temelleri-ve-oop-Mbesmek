package question7;

import java.util.Date;

public class SalesReport  extends Report{
	String [] authDepartments;
	
	public SalesReport(String name, String result, Date createDate) {
		super(name, result, createDate);
	}

	public String[] getAuthDepartments() {
		return authDepartments;
	}

	public void setAuthDepartments(String[] authDepartments) {
		this.authDepartments = authDepartments;
	}
	
	

}

package question7;

import java.util.Date;

public class PersonelReport extends Report {

	
	
	public PersonelReport(String name, String result, Date createDate) {
		super(name, result, createDate);
		
	}
	
	public String hashMD5Result() {
		String hashMD5=super.result+"HashMD5";
		
		return hashMD5;
	}

}

package question7;

import java.util.Date;

public class Report {

	String name;
	String result;
	Date createDate;
	public Report(String name,String result,Date createDate) {
	
		this.name=name;
		this.result=result;
		this.createDate=createDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	
}

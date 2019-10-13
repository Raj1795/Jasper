package jasperExample;

public class Record {
	private String id;
	private String name;
	private String department;
	private String email;
	private int number;
	
	public Record(String id, String name , String department , String email, int number){
	this.id = id;
	this.name = name;
	this.department = department;
	this.email = email;
	this.number= number;
	}
	
	  public String getId() {
	return id;
	}
	        public void setId(String id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getDepartment() {
	return department;
	}
	public void setDepartment(String department) {
	this.department = department;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public int getNumber() {
	return number;
	}
	public void setNumber(int number) {
	this.number = number;
	}
	}


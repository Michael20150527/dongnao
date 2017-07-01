package cn.itcast.property;

public class Person {
	
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void test1(){
		System.out.println("person..." + pname);
	}

}

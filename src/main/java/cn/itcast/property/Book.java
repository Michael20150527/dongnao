package cn.itcast.property;

public class Book {
	
	private String bookname;
	
	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	
	public void test1(){
		System.out.println("Book....." + bookname);
	}

}

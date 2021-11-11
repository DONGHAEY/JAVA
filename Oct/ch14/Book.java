package ch14;

public class Book {
	private static int number = 100;
	private int bookNumber;
	private String name, author;
	
	public Book() { }
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.bookNumber = number++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}


	public void showInfo() {
		System.out.println("책이름은"+name+", 저자는 "+author + bookNumber);
	}
}

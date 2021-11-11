package ch14;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[3];
		Book[] copyLibrary = new Book[3];
		library[0] = new Book("»ï±¹Áö1", "Ä§Âø¸Ç");
		library[1] = new Book("»ï±¹Áö2", "Ä§Âø¸Ç");
		library[2] = new Book("»ï±¹Áö3", "Ä§Âø¸Ç");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		
		System.arraycopy(library, 0, copyLibrary, 0, 3);
		
		copyLibrary[0].setName("¾î¸°¿ÕÀÚ");
		copyLibrary[0].setAuthor("»ýÅÃÁãÆÐ¸®");
		int i =0;
		for(Book book: library) {
			copyLibrary[i++] = book;
		}
		
	}

}

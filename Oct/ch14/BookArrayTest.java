package ch14;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] library = new Book[3];
		Book[] copyLibrary = new Book[3];
		library[0] = new Book("�ﱹ��1", "ħ����");
		library[1] = new Book("�ﱹ��2", "ħ����");
		library[2] = new Book("�ﱹ��3", "ħ����");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		
		System.arraycopy(library, 0, copyLibrary, 0, 3);
		
		copyLibrary[0].setName("�����");
		copyLibrary[0].setAuthor("�������и�");
		int i =0;
		for(Book book: library) {
			copyLibrary[i++] = book;
		}
		
	}

}

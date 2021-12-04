package ch01;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		
		list.addElement("A");
		list.addElement("b");
		list.addElement("c");
		list.addElement("d");
		list.insertElement("D", 1);
		list.printAll();
		//list.removeElement(0);
		list.removeElement(1);
		list.printAll();
	}

}

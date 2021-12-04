package ch01;

public class MyLinkedList {
	private MyListNode head;
	private int cnt = 0;
	
	public MyLinkedList() {
		this.head = null;
		this.cnt = 0;
	}
	public void addElement(String data) {
		MyListNode newNode = new MyListNode(data);
		if(head == null) {
			head = newNode;
		} else {
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		cnt++;
	}
	
	public void insertElement(String data, int position) {
		MyListNode newNode = new MyListNode(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else if(position < 0 || position >cnt) {
			System.out.println("position값 틀림");
			return ;
		} else {
			MyListNode temp = head;
			MyListNode pre = null;
			for(int i=0; i<position; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = newNode;
			newNode.next = temp;
		}
		cnt++;
	}
	public String removeElement(int position) {
		MyListNode temp = head;
		MyListNode pre = null;
		
		if(position <0 || cnt<position) {
			System.out.println("값 틀림");
			return null;
		}
		if(position == 0) {
			head = temp.next;
		} else {
			for(int i = 0; i<position; i++) {
				pre = temp;
				temp = temp.next;
			}
			pre.next = temp.next;
		}
		cnt--;
		return temp.getData();
	}
	
	public void printAll() {
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			if(temp.next != null) System.out.print("->");
			temp = temp.next;
		}
		System.out.println("");
	}
}

package SinglyInsertion;

public class insert {
	
	N head;
	
	public void insertion(int data) {
		
		N node = new N();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			head=node;
		}
		
		else {
			N n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void insertAtStart(int data) {
		N node = new N();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		N node = new N();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
			N n = head;
			int i=0;
			while(i<index-1) {
				n = n.next;
				i++;
			}
			node.next = n.next;
			n.next = node;
		}
		
		
	}
	
	public void deleteAt(int index) {
		
		if(index==0) {
			head = head.next;
		}
		else {
			N n = head;
			N n1 = null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
	
		}
	}
	
	public void show() {
		N node = head;
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data);
	}
}

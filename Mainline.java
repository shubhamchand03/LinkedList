package SinglyInsertion;

public class Mainline {

	public static void main(String[] args) {
		
		
		insert list = new insert();
		list.insertion(5);
		list.insertion(24);
		list.insertion(54);
		list.show();
		System.out.println("\n-----");
		list.insertAtStart(9);
		list.show();
		System.out.println("\n-----");
		list.insertAt(2, 64);
		list.show();
		System.out.println("\n-----");
		list.insertAt(1, 28);
		list.show();
		System.out.println("\n-----");
		list.insertAt(0, 333);
		list.show();
		System.out.println("\n-----");
		list.deleteAt(2);
		list.show();
		
	}

}

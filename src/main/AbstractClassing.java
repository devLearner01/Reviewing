package main;

public class AbstractClassing {
	public static void abstractClassing() {

		String stringData = "5 7 3 9 8 2 1 0 4 6";
		String[] data = stringData.split(" ");

		MyLinkedList myLinkedList = new MyLinkedList();
		for(int i= 0; i< data.length; i++){
			myLinkedList.addNode( new MyNode( data[i] ));
		}
		myLinkedList.print();

	}

}

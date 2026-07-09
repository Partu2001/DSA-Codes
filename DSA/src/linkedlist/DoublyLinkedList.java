package linkedlist;

class DNode {
    int data;
    DNode next;
    DNode prev;

    public DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class DoublyLinkedList {
	DNode head;
	public void insert(int data) {
	    DNode newNode = new DNode(data);
	    if(head == null) {
	        head = newNode;
	        return;
	    }
	    DNode temp = head;
	    while(temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = newNode;
	    newNode.prev = temp;
	}
	
	
	public void insertAtFirst(int data) {
		DNode newNode=new DNode(data);
		if(head!=null) {
			newNode.next=head;
			head.prev=newNode;
		}
		head=newNode;
		
	}

	
	public void dispaly() {
		DNode temp=head;	
		if(temp==null) {
			System.out.println("List is empty");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		head=head.next;
		if(head!=null) {
			head.prev=null;
		}
	}
	
	public void sorting() {
	    if (head == null) {
	        return;
	    }
	    for ( DNode i = head; i.next != null; i = i.next) {
	        for (DNode j = i.next; j != null; j = j.next) {
	            if (i.data > j.data) {
	               int  temp = i.data;
	                i.data = j.data;
	                j.data = temp;
	            }
	        }
	    }
	}
	
	public void reverse() {
	    if (head == null) {
	        return;
	    }
	    DNode current = head;
	    DNode temp = null;
	    
	    while (current != null) {
	        temp = current.prev;
	        current.prev = current.next;
	        current.next = temp;
	        
	        current = current.prev;
	    }
	    if (temp != null) {
	        head = temp.prev;
	    }
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insert(20);
		dl.insert(10);
		dl.insert(50);
		dl.insert(30);
		dl.insert(40);
		
		dl.dispaly();
		
		dl.insertAtFirst(1);
		dl.dispaly();
		
		dl.deleteFirst();
		dl.dispaly();
		
		dl.sorting();
		dl.dispaly();
		
		dl.reverse();
		dl.dispaly();
	}

}

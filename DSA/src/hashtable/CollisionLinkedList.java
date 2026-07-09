package hashtable;

import java.util.LinkedList;

public class CollisionLinkedList {

	public static void main(String[] args) {
		int size=5;
		
		LinkedList<Integer>[] tab=new LinkedList[size];
		
		for(int i=0;i<size;i++) {
			tab[i]=new LinkedList<Integer>();
		}
		int keys[]= {10,21,33,44,55};
		for(int key:keys) {
			int i=key%size;
			tab[i].add(key);
		}
		
		for(int i=0;i<size;i++) {
			System.out.println("Key :" + i + "--> "+ tab[i]);
		}

	}

}

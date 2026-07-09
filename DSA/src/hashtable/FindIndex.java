package hashtable;

public class FindIndex {

	public static void main(String[] args) {

            int[] keys= {101,102,103,104,105};
            int size=5;
            
            for(int key:keys){
            	int i =key % size;
            	System.out.println("Kay : " +key + "-->" + i);
            }

	}

}

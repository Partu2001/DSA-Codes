package hashtable;

public class LinearTest {
	public static void main(String[] args) {
	
        int size=5;
		Integer[] tab=new Integer[size];
		int keys[]= {10,15,20,40};
		
		for(int key:keys) {
			int i=key%size;
			while(tab[i]!=null) {
				i=(i+1)%size;
		}
			tab[i]=key;
		}
	
		for(int i=0;i<size;i++) {
			System.out.println("Key :" + i + "--> "+ tab[i]);
		}
	}
}



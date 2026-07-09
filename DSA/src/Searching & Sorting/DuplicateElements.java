public class DuplicateElements{
                               public static int findOccurence(int[] arr,int tar)
{
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==tar)
{
count++;
}
}
return count;
}

public static void main(String args[]){
int tar=10;
int arr[]={10,20,50,8,98,65,10,38};
int res=findOccurence(arr,10);
System.out.println("Duplicate Occurence :" + tar + " of " +res);
}
}
public class LargestArray
{
   public static int findLargestArray(int[] arr)
{
  int large=arr[0];
 for(int i=0;i<arr.length;i++)
{
if(arr[i]>large){
large=arr[i];
}
}
return large;
}

public static void main(String arg[])
{
int arr[]={10,20,45,93,99};
int res=findLargestArray(arr);
System.out.println("Largest number:" +res);
}
}
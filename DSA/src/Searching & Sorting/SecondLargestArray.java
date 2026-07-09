public class SecondLargestArray
{
   public static int findSecondLargestArray(int[] arr)
{
  int large=arr[0];
  int secondlarge=arr[0];
 for(int i=0;i<arr.length;i++)
{
if(arr[i]>large){
large=arr[i];
}
}

secondlarge=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
if(arr[i]>secondlarge && arr[i]<large)
{
secondlarge=arr[i];
}

}
return secondlarge;
}

public static void main(String arg[])
{
int arr[]={10,20,45,93,99};
int res=findSecondLargestArray(arr);
System.out.println("Second Largest number:" +res);
}
}
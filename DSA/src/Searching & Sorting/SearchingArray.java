public class SearchingArray{

public static int search(int[] arr,int target)
{
         for(int i=0;i<arr.length;i++)
{
    if(arr[i]==target)
{
          return i;
}
}
return -1;
}
 public static void main(String  args[])
{
   int[] arr={10,20,5,78,91};
   int res=search(arr,91);
if(res!=-1)
{
System.out.println("Number found :" + res);
}
else
{
System.out.println("Number not Found");
}
}

}
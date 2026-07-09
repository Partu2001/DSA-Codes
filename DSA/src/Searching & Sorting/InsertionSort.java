//Algorithm :
//Initialize — begin the outer loop at i = 1 (the second element).
//Save key — store arr[i] as k and set j = i − 1 to point at the element just before it.
//Inner loop — while j ≥ 0 and arr[j] > k:
//Shift arr[j] one position to the right (arr[j+1] = arr[j])
//Decrement j by 1
//Insert — place k at arr[j+1] (its correct sorted position).
//Advance — increment i and repeat from step 2 until the end of the array.


public class InsertionSort
{
  public static void insertSort(int[] arr)              // method that takes an integer array as input
  {
    for(int i=0; i<arr.length; i++)                           // loop through every element in the array
    {
      int k = arr[i];                                                   // save the current element to compare and place it correctly
      int j = i-1;                                                       // start looking at the element just before current position

      while(j >= 0 && arr[j] > k)                       // keep going left as long as elements are bigger than k
      {
        arr[j+1] = arr[j];                                     // shift the bigger element one position to the right
        j--;                                                            // move one step to the left
      }

      arr[j+1] = k;                                               // place k in its correct sorted position
    }
  }

  public static void main(String args[])     // starting point of the program
  {
    int[] arr = {11, 3, 5, 2, 9,10,4,7};          // create an array with 5 unsorted numbers
    insertSort(arr);                                       // call the sort method to sort the array

    for(int num : arr)                                  // loop through each number in the sorted array
    {
      System.out.println(num);               // print each number on a new line
    }
  }
}
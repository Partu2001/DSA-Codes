// Algorithm "
//1.Start from position 0. Assume it holds the minimum value.
//2.Scan the rest of the array to find the actual smallest element.
//3.Swap the smallest found with the element at the current position.
//4.Move forward by one position and repeat until the whole array is sorted.


public class SelectionSort {
  public static void selectionSort(int arr[]) {
    // Outer loop: move the "sorted boundary" one step right each time
    for (int i = 0; i < arr.length; i++) {
      // Assume the first unsorted element is the smallest
      int min = i;
      // Inner loop: scan the rest to find the true minimum
      for (int j = i + 1; j < arr.length; j++) {
        // If arr[j] is smaller than current min, update min index
        if (arr[j] < arr[min]) {
          min = j;                                // remember index of new minimum
        }
      }
      // Swap the found minimum with the element at position i
      int temp = arr[min];             // save the minimum value
      arr[min] = arr[i];                  // put arr[i] where min was
      arr[i] = temp;                      // put the minimum at position i
    }
  }

  public static void main(String args[]) {
    int[] arr = {5, 1, 10, 8, 3};            // unsorted input array
    selectionSort(arr);                      // sort the array in-place
    for (int num : arr) {                    // loop through sorted array
      System.out.println(num);     // print each number
    }
  }
}
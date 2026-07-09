import java.util.Scanner;  // Import Scanner to take input from user

public class BubbleSort  // Create a class named BubbleSort
{
    public static void findSort(int[] arr)  // Method to sort the array (takes array as input)
    {
        for (int i = 0; i < arr.length; i++)  // Outer loop: goes through each element
        {
            for (int j = i + 1; j < arr.length; j++)  // Inner loop: compares current element with the next ones
            {
                if (arr[i] > arr[j])  // If left number is bigger than right number, swap them
                {
                    int temp = arr[i];  // Save left number in a temporary variable
                    arr[i] = arr[j];   // Put right number in left position
                    arr[j] = temp;     // Put saved (left) number in right position
                }
            }
        }
    }

    static void printArray(int[] arr)  // Method to print all elements of the array
    {
        for (int num : arr)  // Go through each number in the array one by one
        {
            System.out.println(num);  // Print each number on a new line
        }
    }

    public static void main(String args[])  // Main method: program starts running from here
    {
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read user input

        System.out.println("Enter the size array");  // Ask user to enter how many numbers they want
        int n = sc.nextInt();  // Read and store the size entered by user

        int arr[] = new int[n];  // Create an empty array of the size user entered

        System.out.print("Enter the array");  // Ask user to enter the numbers
        for (int i = 0; i < n; i++)  // Loop to read each number one by one
        {
            arr[i] = sc.nextInt();  // Store each entered number into the array
        }

        findSort(arr);  // Call the sort method to sort the array

        System.out.println("Sorted Array");  // Print the label "Sorted Array"
        printArray(arr);  // Call print method to display the sorted numbers
    }
}
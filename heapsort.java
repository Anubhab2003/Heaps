import java.util.*;

public class heapsort {
  public static void HeapSort(int arr[]) {
    // Step 1: Build a max heap
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(arr, i, n);
    }

    // Step 2: Extract elements one by one
    for (int i = n - 1; i > 0; i--) {
      // Swap the largest element (root) with the last element
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // Heapify the reduced heap (excluding the last element)
      heapify(arr, 0, i);
    }
  }

  public static void heapify(int arr[], int i, int size) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // If left child is larger than root
    if (left < size && arr[left] > arr[largest])
      largest = left;

    // If right child is larger than largest so far
    if (right < size && arr[right] > arr[largest])
      largest = right;

    // If largest is not root
    if (largest != i) {
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      // Recursively heapify the affected sub-tree
      heapify(arr, largest, size);
    }
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 4, 5, 3};

    HeapSort(arr);

    System.out.println("Sorted array is ");
    for (int i = 0; i < arr.length; ++i)
      System.out.print(arr[i] + " ");
  }
}

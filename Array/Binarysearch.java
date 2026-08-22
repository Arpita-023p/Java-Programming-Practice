public class Binarysearch {
  static int bianrysearch(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        end = mid + 1;
      } else {
        start = mid - 1;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 34, 56, 78, 90 };
    int target = 78;
    System.out.println(bianrysearch(arr, target));
  }
}

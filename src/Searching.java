import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 11, 54, 67 };
        int target = 4;
        // int ans = linearsearch(arr, target);
        int ans = binarysearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int linearsearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int binarysearch_recurssive(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarysearch_recurssive(arr, target, start, mid - 1);
        } else {
            return binarysearch_recurssive(arr, target, mid + 1, end);

        }

    }

    static int binarysearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    // first nd last occurrence
    public static int[] firstAndLastPosition(int arr, int n, int k) {
        // Write your code here.
        int start = 0;
        int end = n - 1;
int firstoccurrence = -1;
int lastoccurrence = -1;
        while (start <= end) {
        int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
if(arr[mid-1]==k ){

}
            } else if (arr[mid] > k) {
                end = mid - 1;

            } else if (arr[mid] < k) {
                start = mid + 1;
            }
        }
    }
}

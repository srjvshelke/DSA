
public class Sorting {

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 1, 9, 2};
        // BubbleSortmin(arr);
        BubbleSortmax(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // 

    //1.bubble sort
    //minimum
    static void BubbleSortmin(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int idx = i + 1; idx < arr.length; idx++) {
                if (arr[min] > arr[idx]) {
                    min = idx;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    //maximum
    static void BubbleSortmax(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = i;
            for (int idx = 0; idx < i; idx++) {
                if (arr[max] < arr[idx]) {
                    max = idx;
                }
            }
            if (i != max) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
    }
    //

    // insertion sort
    static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            
            while () {
                
            }
            
        }
    }
}

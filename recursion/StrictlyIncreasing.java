// check if the array elements are strictly increasing or not
//  means every next element should be greator than previous 
package recursion;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int idx = 0;
        int arrlen = array.length - 1;
        strictly(array, idx, arrlen);
    }

    public static void strictly(int[] arr, int idx, int arrlen) {
        if (arr[idx] >= arr[idx + 1]) {
            System.out.println("Not strictly increasing");
            return;
        }
        if (idx == arrlen - 1) {
            System.out.println("Strictly Increasing");
            return;
        }
        strictly(arr, idx + 1, arrlen);
    }
}

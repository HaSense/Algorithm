package kr.co.vertha;

public class PermutationTest_L1 {

    public static void permutation(int[] arr, int current, int n) {
        if(current == n) {
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + (i < arr.length - 1 ? " " : ""));
            }
            System.out.println();
            return;
        }
        for(int i = current; i<n; i++){
            swap(arr, i, current);
            permutation(arr, current + 1, n);
            swap(arr, i, current);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, 0, arr.length);
      }
}

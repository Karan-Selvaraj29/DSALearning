import java.util.Scanner;
public class LinearBinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;

        System.out.println("Linear Search: Target " + target + " found in step no :" + LinearBinary.linearSearch(arr, target));

        System.out.println("Binary Search: Target " + target + " found in step no :" + LinearBinary.binarySearch(arr, target));

        System.out.println("Recursive search: Target is " + LinearBinary.recursiveSearch(arr, target,0, arr.length-1));


    }

    // Linear search in sorted Array

    public static int linearSearch(int[] arr, int target) {
        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                return steps;
            }
        }
        return -1;

    }

    //Binary Search in Sorted Array

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int steps = 0;

        while (left <= right) {

            steps++;
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return steps;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid + 1;
            }
        }

        return -1;


    }

    //Binary Search Using recursion
    public static int recursiveSearch(int[] arr, int target,int left, int right){

        int mid=(left+right)/2;

        if(arr[mid]==target){
            return arr[mid];
    }
        else if(arr[mid]<target){
            return recursiveSearch(arr, target, mid+1, right);
        }
        else{
            return recursiveSearch(arr, target, left , mid-1);
        }
    }


}

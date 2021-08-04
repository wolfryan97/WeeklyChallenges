import java.util.Arrays;

// Problem 2: Write java Program to Find Smallest and Largest Element in an Array.
// Note: Number can not be repeated in the array.

// For example:
// 1
// 2
// 3
// 4
// 5
// 6

// int[] arr1={7,5,6,1,4,2};
// Missing number : 3
// int[] arr2={5,3,1,2};
// Missing number : 4

public class Problem2 {
    
    public static void smallestLargest(int[] arr){
        System.out.println("Array:\n" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Largest: " + arr[arr.length - 1]);
        int missing = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=(arr[0]+i)){
                missing = i+arr[0];
                break;
            }
        }
        System.out.println("Missing: " + missing);
    }

    public static void main(String[] args) {
        int[] arr1={7,5,6,1,4,2};
        smallestLargest(arr1);
    }
}

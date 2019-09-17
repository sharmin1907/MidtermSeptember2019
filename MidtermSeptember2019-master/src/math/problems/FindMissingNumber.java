package math.problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number is: "+missingNumber(array));
    }
    public static int missingNumber(int[] array){
        int n=array.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for(int i=0;i<array.length;i++) {
            restSum += array[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
        }
    }

package Module1.Class8_Intermediate_DSA_Arrays_Sliding_Window_and_Contribution_Technique;

// Q. You are given an integer array A of length N.
// You have to find the sum of all subarray sums of A.
// More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
// A subarray sum denotes the sum of all the elements of that subarray.

// Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

// A = [1, 2, 3]

// The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
// Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20

public class Q01_Sum_of_All_Subarrays {

    public static long subarraySum(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        int ans =0;
        int sumOfSubArray=0;

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + A[i];
        }

        for(int i =0; i<n;i++){
            for(int j =i; j<n;j++){
                sumOfSubArray = prefix[j];

                if(i!=0){
                sumOfSubArray -= prefix[i-1];
            }
            sumOfSubArray+=ans;
            }
        }

        return ans;
}
   public static void main(String[] args){

    int[] A = {1,2,3};

    subarraySum(A);

   }

}

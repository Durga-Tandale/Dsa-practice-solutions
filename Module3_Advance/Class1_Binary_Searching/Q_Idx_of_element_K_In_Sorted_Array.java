// Q - given sorted(distinct) array of size N, find the idx of element k, if k doesn't exist return -1.
//k = 20
package Module3_Advance.Class1_Binary_Searching;

public class Q_Idx_of_element_K_In_Sorted_Array {

public int bSearch(int[] A, int K){
    int N = A.length;
    int lo = 0, hi = N-1;
    
    while(lo<=hi){
       int mid = lo + (hi-lo)/2;

       if(A[mid] == K){
        return mid;
       }
       else if(A[mid] < K){
        //discard left
        lo = mid+1;
       }
       else{
        //discard right
        hi = mid-1;
       } 
    }
    return -1;
}
    
}


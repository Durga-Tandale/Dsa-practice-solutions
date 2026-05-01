package AdvanceDSA3.Class3_Lab_Session_on_Maths_and_2_Pointers;
// Problem Description
// Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.
// For example:

//     1 -> A
//     2 -> B
//     3 -> C
//     ...
//     26 -> Z
//     27 -> AA
//     28 -> AB 

//     Example Input
// Input 1:
// A = 3

// Input 2:
// A = 27

// Example Output
// Output 1:
// "C"

// Output 2:
// "AA"

public class Q1_Excel_Column_Title {

public static String columnTitle(int A){

    String ans="";
    
    while(A>0){
        int rem = A%26;
        A /= 26;
        if(rem == 0){
            A= A-1;
            rem = 26;
        }
        char ch = (char) ((rem-1) + 'A');
        ans = ch+ans;
    }

    return ans;
}
    public static void main(String[] args) {
        int A =30;
        String res = columnTitle(A);
        System.out.println(res);
    }
}

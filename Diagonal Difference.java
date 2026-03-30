Given a square matrix, calculate the absolute difference between the sums of its primary and secondary diagonals.

Primary diagonal
Elements where row index and column index are the same: arr[0][0], arr[1][1], ..., arr[n-1][n-1].

Secondary diagonal
Elements where row + column = n - 1: arr[0][n-1], arr[1][n-2], ..., arr[n-1][0].

Task
Return: |(sum of primary diagonal) - (sum of secondary diagonal)|.

Function Signature
int diagonalDifference(List> arr)
Input Format
First line contains an integer n (size of the square matrix).
Next n lines each contain n space-separated integers.
Output Format
A single integer: the absolute diagonal difference.

Example
Input:
3
11 2 4
4 5 6
10 8 -12

Output:
15
Explanation
Primary diagonal sum = 11 + 5 + (-12) = 4
Secondary diagonal sum = 4 + 5 + 10 = 19
Absolute difference = |4 - 19| = 15

  -------------------------------------------------------------

import java.io.*;
import java.util.*;


class Solution {
    public int solve(ArrayList<ArrayList<Integer>> arr) {
        int n = arr.size();
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr.get(i).get(i);   
            secondary += arr.get(i).get(n - 1 - i);       
        }

        return Math.abs(primary - secondary);
    }
}

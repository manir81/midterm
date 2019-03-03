package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    // function to calculate Small
    // result between two arrays
    static int FindLowestDifference(int array1[], int array2[], int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0;
        int b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n) {
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);

            // Move Smaller Value
            if (array1[a] < array2[b])
                a++;

            else
                b++;
        }

        // return final sma result
        return result;
    }

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        // Calculate size of Both arrays
        int m = array1.length;
        int n = array2.length;

        // Call function to
        // print smallest result
        System.out.println(FindLowestDifference(array1, array2, m, n));
    }
}

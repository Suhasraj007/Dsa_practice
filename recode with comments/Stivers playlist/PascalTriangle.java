import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        // System.out.println(NthRowMthcolumnPascal(5, 3));
        int n = 0;
        for (int i = 0; i < 6; i++) {
            List<Integer> ans = returnNthindexPascal(n);
            System.out.println(ans);
            n++;
        }
        // List<List<Integer>> pascal = findPascal(n);
        // System.out.println(pascal);
    }

    // print all the rows
    private static List<List<Integer>> findPascal(int n) {
        // create a new list of list of integers to return it as result
        List<List<Integer>> result = new ArrayList<>();

        // add the list of integers to the list of list of integers
        // means adding the rows into the matrix in simple terms
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
            // now we know in pascal triangle each row has n elements only
            // so we are using 0th row will have 0 index and the so on ...
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // in pascal triangle we know that the first and last index are always 1
                    result.get(i).add(1);
                } else {
                    // for the midddle elements get the previous row and add the j-1th and jth index
                    result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
        }

        // if its empty return null
        if (result.isEmpty()) {
            return null;
        }

        return result;
    }

    // print the nth index row only
    // remeber the formula row C column (nCr)
    // we are getting the 1st element as 1 and then keep on multiplying with row
    // number and decrement it and divide by column number and its automatically
    // incremented by the loop
    private static List<Integer> returnNthindexPascal(int n) {
        // create a new list of integers to return it as result
        List<Integer> result = new ArrayList<>();

        if (n < 0) {
            result.add(-1);
            return result;
        }

        // adding the 0th row
        int ans = 1;
        result.add(ans);

        // here they have already given in index so dont bother of r - 1 and c - 1
        // so we have to multiply the current ans with row and divide by column
        // consider n = 4, so 4C0 is done now i have to start from 4C1
        // but my i is starting from 0 so ill add 1 to column
        for (int i = 1; i <= n; i++) {
            ans *= n - i + 1;
            ans /= i;
            result.add(ans);
        }
        return result;
    }

    // this method return the Nth row of pascal triangle
    // since they give the row number we have to use r-1 C c
    // because they have not given the column number.
    private static List<Integer> returnNthPascal(int n) {
        // create a new list of integers to return it as result
        List<Integer> result = new ArrayList<>();
        if (n == 0 || n < 0) {
            result.add(-1);
            return result;
        }

        // adding 1st row
        int ans = 1;
        result.add(ans);

        // consider the row = 5, r-1 C c should be performed
        // 4C0 is already done , now we want 4C1 multiply by 4 and divide by 1 amd so on
        for (int i = 1; i < n; i++) {
            ans *= n - i;
            ans /= i;
            result.add(ans);
        }
        return result;
    }

    // this method return the element at the Nth row and Nth column of the pascal
    // triangle
    private static int NthRowMthcolumnPascal(int n, int m) {

        if (n <= 0 || m <= 0) {
            return -1;
        }

        int ans = 1;
        if (m == 1 || n == 1 || m == n) {
            return 1;
        } else {
            // perform r-1 C c-1 (row - 1 C col - 1)
            n = n - 1;
            m = m - 1;
            ans = factorial(n) / (factorial(n - m) * factorial(m));
        }
        return ans;
    }

    static int factorial(int k) {
        int ans = 1;
        while (k > 1) {
            ans *= k;
            k--;
        }
        return ans;
    }
}

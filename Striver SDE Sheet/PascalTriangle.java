import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines of pascal triangle");
        int input = sc.nextInt();
        List<List<Integer>> ans = createPascal(input);
        System.out.println(ans);
    }

    private static List<List<Integer>> createPascal(int input) {
        if (input == 0) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.get(i).add(1);
                } else {
                    result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
        }
        return result;
    }
}

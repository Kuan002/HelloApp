import java.util.Scanner;

public class longestCommonPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of strings
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        // Read the strings into an array
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Call Solution class
        LCPSolution solution = new LCPSolution();
        String result = solution.longestCommonPrefix(strs);

        // Output the result
        System.out.println(result);

        sc.close();
    }
}

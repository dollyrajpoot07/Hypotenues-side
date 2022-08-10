// Find the Hypotenues side
//Input: 2 3
//Output: 4.0

import java.util.*;

public class Hypotenues {
    public static double hypot(int A, int B) {
        int squareOfA = A*A;
        int squareOfB = B*B;
        int sum = squareOfA + squareOfB;
        double root = Math.round(Math.sqrt(sum));
        
        return root;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // double result = Math.round(Math.sqrt((A*A) + (B*B)));
        double result = hypot(A, B);
		System.out.println(result);
        sc.close();
  }
}

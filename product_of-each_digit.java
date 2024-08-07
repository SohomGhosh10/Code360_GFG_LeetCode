import java.util.*;
class Tester {
	public static void main(String[] args) {
		// Implement your code here
		public static boolean isSeed(int x, int y) {
        int product = x;
        int temp = x;

        // Multiply X by each of its digits
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                return false; // A seed cannot have zero digits
            }
            product *= digit;
            temp /= 10;
        }

        return product == y;
		}
	}
}

import java.util.*;
class Tester {
	public static void main(String[] args) {
		// Implement your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int digit;
		int count = (int) Math.log10(n) + 1;
		
		public boolean isArmstrong(int n){
		    while(n != 0){
		        digit = n % 10;
		        sum += Math.pow(digit , count);
		        n = n / 10;
		    }
		    return sum == n;
		}
		
		if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
	}
}

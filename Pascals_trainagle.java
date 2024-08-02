import java.util.*;
public class Pascals_trainagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }
            int val = 1;
            for(int k = 0; k <= i; k++){
                System.out.print(val + " ");
                val = val * (i-k)/(k+1);
            }

            System.out.println();
        }
    }
}

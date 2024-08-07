import java.util.Scanner;

public class LoanEligibilityChecker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter account balance:");
        double accountBalance = scanner.nextDouble();
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        System.out.println("Enter loan type (Car/House/Business):");
        String loanType = scanner.next();
        System.out.println("Enter expected loan amount:");
        double expectedLoanAmount = scanner.nextDouble();
        System.out.println("Enter expected number of EMIs:");
        int expectedEMIs = scanner.nextInt();

        // Validations
        if (!isValidAccountNumber(accountNumber)) {
            System.out.println("Invalid account number. It should be a 4-digit number starting with 1.");
            return;
        }

        if (accountBalance < 1000) {
            System.out.println("Insufficient account balance. Minimum balance of $1000 is required.");
            return;
        }

        // Determine eligibility
        double eligibleLoanAmount = 0;
        int numberOfEMIs = 0;

        switch (loanType.toLowerCase()) {
            case "car":
                if (salary > 25000) {
                    eligibleLoanAmount = 500000;
                    numberOfEMIs = 36;
                }
                break;
            case "house":
                if (salary > 50000) {
                    eligibleLoanAmount = 6000000;
                    numberOfEMIs = 60;
                }
                break;
            case "business":
                if (salary > 75000) {
                    eligibleLoanAmount = 7500000;
                    numberOfEMIs = 84;
                }
                break;
            default:
                System.out.println("Invalid loan type.");
                return;
        }

        if (eligibleLoanAmount == 0 || numberOfEMIs == 0) {
            System.out.println("Salary not sufficient for the selected loan type.");
        } else if (expectedLoanAmount <= eligibleLoanAmount && expectedEMIs <= numberOfEMIs) {
            System.out.println("Loan approved.");
            System.out.println("Eligible loan amount: $" + eligibleLoanAmount);
            System.out.println("Number of EMIs: " + numberOfEMIs);
        } else {
            System.out.println("Loan not approved. The requested loan amount or number of EMIs exceeds the limit.");
        }

        scanner.close();
    }

    public static boolean isValidAccountNumber(int accountNumber) {
        return String.valueOf(accountNumber).matches("1\\d{3}");
    }
}

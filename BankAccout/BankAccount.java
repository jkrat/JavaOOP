import java.util.Random;

public class BankAccount implements java.io.Serializable {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public static int numberOfAccounts;
    public static double totalInAllAccounts;

    public BankAccount() {
        checkingBalance = 0;
        savingsBalance = 0;
		accountNumber = createAccountNumber();
		numberOfAccounts++;
	}

    private String createAccountNumber() {
        Random r = new Random();
        String newStr = "";
        for (int i = 0; i < 10; i++) {
            newStr += r.nextInt(10);
        }
        return newStr;
    }


    public String getAccountNumber() {
		return accountNumber;
    }
    
    public Double getCheckingBalance() {
		return checkingBalance;
	}
	public void depositCheckingBalance(Double checkingBalance) {
        this.checkingBalance += checkingBalance;
        totalInAllAccounts += checkingBalance;
    }
	public void withdrawCheckingBalance(Double checkingBalance) {
        if (this.checkingBalance - checkingBalance < 0) {
            System.out.println("insufficient funds");
        } else {
        this.checkingBalance -= checkingBalance;
        totalInAllAccounts -= checkingBalance;
        System.out.println("successful withdrawl");
        }
    }
    
    public Double getSavingsBalance() {
		return savingsBalance;
	}
	public void depositSavingsBalance(Double savingsBalance) {
        this.savingsBalance += savingsBalance;
        totalInAllAccounts += savingsBalance;
	}
	public void withdrawSavingsBalance(Double savingsBalance) {
        if (this.savingsBalance - savingsBalance < 0) {
            System.out.println("insufficient funds");
        } else {
        this.savingsBalance -= savingsBalance;
        totalInAllAccounts -= savingsBalance;
        System.out.println("successful withdrawl");
        }
	}

}
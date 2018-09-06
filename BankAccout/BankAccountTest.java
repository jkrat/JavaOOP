import javax.print.attribute.standard.NumberOfDocuments;

public class BankAccountTest {

	public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new BankAccount();
        BankAccount acct3 = new BankAccount();
        acct1.depositSavingsBalance(100.00);
        acct2.depositSavingsBalance(500.00);
        acct1.depositCheckingBalance(200.00);
        acct3.depositCheckingBalance(300.00);
        acct3.depositCheckingBalance(300.00);
        

        System.out.println(acct1.getAccountNumber());
        System.out.println(acct1.getSavingsBalance());
        System.out.println(acct1.getCheckingBalance());
        System.out.println(BankAccount.numberOfAccounts);
        System.out.println(BankAccount.totalInAllAccounts);


        acct3.withdrawCheckingBalance(500.00);
        acct3.withdrawCheckingBalance(300.00);

    }
}

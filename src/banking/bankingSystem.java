package banking;
import java.util.Scanner;
import banking.AccountDetail;

class bankingSystem implements BankOperation {
     AccountDetail accountHolder;
     int numberOfAccounts;

    public bankingSystem(AccountDetail accountHolder) {
        this.accountHolder = accountHolder;
        this.numberOfAccounts=0;

    }

    @Override
    public void accountDetail() {
        Scanner scanner = new Scanner(System.in);
        int givenAccountNumber = scanner.nextInt();
//        AccountDetail accountDetail = new AccountDetail();
//        String getAccountNumber = accountDetail.getAccountNumber();

    }

    @Override
    public int empty() {
        return 0;
    }

    @Override
    public int addAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Number : ");
        String givenAccountNumber = scanner.next();
        AccountDetail accountDetail = new AccountDetail("221356456","mukund bansal",2);
        String provideAccountNumber = accountDetail.getAccountNumber();
        if(givenAccountNumber.equals(AccountNumber)){

        }

        return 0;
    }
}

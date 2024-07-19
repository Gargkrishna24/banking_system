package banking;
import java.util.Scanner;

class BankingSystem implements BankOperation {
     AccountDetail accountHolder;
     int numberOfAccounts;


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
        if(givenAccountNumber.equals(provideAccountNumber)){
            System.out.println("Account already existed");
        }else {
            System.out.println("Enter Account Holder Name : ");
            String name = scanner.next();
            long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
            String str = String.valueOf(number);
            AccountDetail newCustomer = accountHolder;


        }

        return 0;
    }
}

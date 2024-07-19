package banking;

public class AccountDetail {
    private  String accountNumber;
    private String accountHolderName;
     private long accountBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public AccountDetail(String accountNumber, String accountHolderName, long accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    long deposit(long amount){
        accountBalance=accountBalance+amount;
        return amount;
    }
    long withdrawal(long amount){
        if(accountBalance<0){
            System.out.println("You have zero account balance");
        }else {
            amount=accountBalance-amount;
        }
        return amount;
    }

}


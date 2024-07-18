import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Krishna Bank Of India !");
        Thread.sleep(2000);
        System.out.println("Are you existing customer! if yes press 1 or not then press 2 ");
        Thread.sleep(1000);
        int customerExisted = scanner.nextInt();
        if (customerExisted == 1 || customerExisted == 2) {
            switch (customerExisted) {
                case 1:
                    System.out.println("welcome to bank");
                    break;
                case 2 :
                    System.out.println("first login to bank account");
                    break;
            }
        }else {
            System.out.println("sorry! we expected a right answer ");
        }
    }
}
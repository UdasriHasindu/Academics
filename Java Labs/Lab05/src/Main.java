import Question02.library.books.FictionBooks;
import Question03.BankAccount;
import static Question02.library.utils.BookUtils.printBookDetails;

public class Main {
    public static void main(String[] args) {


        // Question 02
        FictionBooks fictions = new FictionBooks("Harry Portter", "J.K.Rowline", "fantacy & Adventure");
        printBookDetails(fictions);

        // Question 03
        BankAccount acc = new BankAccount(55258.95);

        System.out.println("You have "+ acc.getBalance() + " Rs on your account");
        acc.deposit(1500.00); // deposit money to account
        System.out.println("Current bank balance is : " + acc.getBalance());

        acc.withdraw(12000.00); // withdraw mone from account
        System.out.println("Current bank balance is : " + acc.getBalance());

    }
}
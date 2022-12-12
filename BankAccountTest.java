public class BankAccountTest {
    public static void main(String[] args){
        System.out.println("---------BankAccount----------");
        BankAccount ba1 = new BankAccount ();

        ba1.deposit("savings", 60.00);
        ba1.deposit("checking", 40.00);
        ba1.totalBal();
        ba1.withdrawal("savings", 50.00);
        ba1.withdrawal("checking", 50.00);
        ba1.totalBal();
    }
}
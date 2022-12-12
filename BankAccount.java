public class BankAccount {
    
    //attributes
    private double checking = 0.0;
    private double savings = 0.0;
    private static int accts = 0;
    private static double totalMoney = 0.0;

    //constructor
    public BankAccount(){
        Double checking = 0.0;
        Double savings = 0.0;
        accts += 1;
		System.out.println("Total accounts created: " + accts + ".");	
    }

    //methods
    public void deposit(String type, double amount) {
        if( type=="checking") {
            setChecking(getChecking() + amount);
            totalMoney += amount;
        }
        else if(type=="savings") {
            setSavings(getSavings() + amount);
            totalMoney += amount;
        }
        else {
            System.out.println("Please choose account type.");
        }
    }

    public void withdrawal(String type, double amount) {
        if(type=="checking") {
            if(getChecking() < amount) {
                System.out.println("Insufficient Funds!");
            }
            else{
                setChecking(getChecking() - amount);
                totalMoney -= amount;
            }
        }
        else if(type=="savings") {
            if(getSavings() < amount) {
                System.out.println("Insufficient Funds!");
            }
            else{
                setSavings(getSavings() - amount);
                totalMoney -= amount;
            }
        }
        else {
            System.out.println("Please choose account type.");
        }
    }

    public Double totalBal() {
        double totalBal = checking + savings;
        System.out.println(totalBal);
        return totalBal;
    }

    //getters and setters

    public double getChecking(){
        return this.checking;
    }
    public void setChecking(double checking){
        this.checking=checking;
    }

    public double getSavings(){
        return this.savings;
    }
    public void setSavings(double savings){
        this.savings=savings;
    }
}
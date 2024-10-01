public class Main {
    public static void main(String[] args) {

        double INTEREST_RATE = 0.17;
        double currentBalance = 5000.00;
        double interest = 0.00;

        interest = currentBalance * INTEREST_RATE;
        currentBalance += interest;
        System.out.println("The interest due after the first month is: $" + interest);
        interest = currentBalance * INTEREST_RATE;
        System.out.println("The interest due after the second month is: $" + interest);



    }
}
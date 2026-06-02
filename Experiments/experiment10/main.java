public class main {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                "SA101",
                "Ashutosh Tiwari",
                10000);

        CurrentAccount ca = new CurrentAccount(
                "CA201",
                "Rahul Sharma",
                15000);

        sa.deposit(2000);
        ca.deposit(3000);

        System.out.println("\n--- Savings Account Details ---");
        sa.displayDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println("\n--- Current Account Details ---");
        ca.displayDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}
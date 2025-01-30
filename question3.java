import java.util.Scanner;

class PremiumMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly income (₹): ");
        double income = scanner.nextDouble();

        System.out.print("Do you have pending dues? (true/false): ");
        boolean hasDues = scanner.nextBoolean();

        String result = (age >= 18 && income >= 30000 && !hasDues) ? "Eligible for Premium Membership" : "Not Eligible for Premium Membership";

        System.out.println(result);

        scanner.close(); 
    }
}

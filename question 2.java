import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int input = as.nextInt();
        int ans = 0;

        if (input > 5000) {
            ans = (int) (input * 0.2); 
            System.out.print(input - ans);
        } 
        else if (input >= 3000) {  
            ans = (int) (input * 0.1);
            System.out.print(input - ans);
        } 
        else {  
            System.out.print(input - ans);
        }

        as.close();  
    }
}

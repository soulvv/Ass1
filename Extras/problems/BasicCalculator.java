import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': 
                if (b != 0) result = a / b; 
                else { System.out.println("Error: Division by zero"); sc.close(); return; }
                break;
            default:
                System.out.println("Invalid operation"); 
                sc.close(); 
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

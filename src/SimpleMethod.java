import java.util.Scanner;
public class SimpleMethod {
    // Put your method code here
    public static int square(int i) {
        // Put your code here
        int square = i*i;
        return square;
    }

    public static void main(String[] args) {
        // This is the method call, create the square method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(square(number));
    }
}

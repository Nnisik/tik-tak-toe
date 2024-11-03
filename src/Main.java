import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int check = 0;
        for (double i = 0; i < input.length(); i++) {
            System.out.printf("%c ", input.charAt((int)i));
            check += 1;
            if (check == 3) {
                System.out.print("\n");
                check = 0;
            }
        }
    }
}

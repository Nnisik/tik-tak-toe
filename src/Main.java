import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        drawHorizontalBoardline();

        int check = 0;

        for (double i = 0; i < input.length(); i++) {
            if (check == 0) {
                drawVerticalBoardLine();
            }
            System.out.print(input.charAt((int)i) + " ");
            check += 1;
            if (check == 3) {
                drawVerticalBoardLine();
                System.out.print("\n");
                check = 0;
            }
        }

        drawHorizontalBoardline();
    }

    static void drawHorizontalBoardline() {
        System.out.println("---------");
    }

    static void drawVerticalBoardLine() {
        System.out.print("| ");
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        String input = "XO_XO_XOX";
        scanner.close();

        int check = 0;
        GlobalVariables.gameResult = "";

        drawHorizontalBoardline();

        for (double i = 0; i < input.length(); i++) {

            if (check == 0) {
                drawVerticalBoardLine();
            }
            drawNextElement(input.charAt((int)i));
            check += 1;

            if (check == 3) {
                drawVerticalBoardLine();
                System.out.print("\n");
                check = 0;
            }
        }
        drawHorizontalBoardline();
        System.out.println(GlobalVariables.gameResult);
    }

    static void drawHorizontalBoardline() {
        System.out.println("---------");
    }

    static void drawVerticalBoardLine() {
        System.out.print("| ");
    }

    static void drawNextElement(char symbol) {
        if (Character.compare(symbol, '_') == 0){
            System.out.print(" ");
            GlobalVariables.gameResult = "Game not finished";
        } else {
            System.out.print(symbol);
        }
        System.out.print(" ");
    }
}

import java.util.Scanner;

public class BattleShip {
    static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter name player 1");
        playerName1 = scanner.nextLine();
        System.out.println("Enter name player 2");
        playerName2 = scanner.nextLine();
        drawfiled();
    }


    public static void drawfiled() {
        System.out.println(playerName1+", please please your 4-deck ship:");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+" - - - - - - - - - -");

        }
        System.out.println("please enter X coordinate: ");
        int x =scanner.nextInt();
        System.out.println("please enter Y coordinate: ");
        int y =scanner.nextInt();
        System.out.println("Choose direction:");
        System.out.println("1 Vertical");
        System.out.println("2 Horizontals");
        int rotation = scanner.nextInt();


    }
}

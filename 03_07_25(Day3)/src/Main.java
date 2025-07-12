import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        Menu.showMenu(mainScanner);
        Scores.showScores(mainScanner);
    }
}

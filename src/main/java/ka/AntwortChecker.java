package ka;
import javax.swing.*;
import java.util.Scanner;

public class AntwortChecker {

    public static boolean checkAntwort(Scanner sc, String x) {
        String antwort= sc.nextLine();
        return true;
    }

    public static boolean checkAntwort(Scanner sc, int x) {
        int antwort= sc.nextInt();
        return true;
    }

    public static boolean checkAntwort(Scanner sc, boolean x) {
        boolean antwort= sc.nextBoolean();
        return true;
    }

    public static boolean checkAntwort(Scanner sc, double x) {
        double antwort= sc.nextDouble();
        return true;
    }

    public static boolean checkAntwort(Scanner sc, char x) {
        char antwort= sc.next().charAt(0);
        return true;
    }

}

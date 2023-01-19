package ch.bbw.Deadzork.Helper;

import java.util.Scanner;

public class ScannerHelper {

    public String getUserInput(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }
}

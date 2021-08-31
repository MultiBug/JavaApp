package com.company;
import java.util.Scanner;
// коментарии в одну строку /* коментарий в не сколько строк */
/** Коментарии Документации */
public class test {
    public static void main(String[ ] args) {
        String name = "Vlad";
        int age = 31;
        double score = 18.7;
        char group = 'M';
    }
}
class MyClass {
    public static void main(String[ ] argv) {
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());
    }
}
class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int hours = days * 24;
        int min = hours * 60;
        int sec = min * 60;
        System.out.println(sec);
    }
}
class Credit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int x1 = amount - amount / 10;
        int x2 = x1 - x1 / 10;
        int x3 = x2 - x2 / 10;
        System.out.println(x3);
    }
}

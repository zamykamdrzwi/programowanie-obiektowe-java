import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(" witaj w systemie rezerwacji");
        System.out.println();
//        displayHotelInformation();
        System.out.println();
//        displayCompanyInformation();
        tabMnozenia();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
    }

    public static void displayCompanyInformation() {
        System.out.println("Autorem systemu jest: ");
        System.out.println(" Clockwork Java");
        System.out.println(" ul. Programistów 32");
        System.out.println(" 31-333 kraków");
    }

    public static void displayHotelInformation() {
        System.out.println(" --- hotel clockwork java ---");
        System.out.println(" ul. Programistów 32");
        System.out.println(" 31-333 kraków");
        System.out.println(" tel. 322 444 123");

        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Poniedziałek";
        daysOfWeek[1] = "Wtorek";
        daysOfWeek[2] = "Środa";
        daysOfWeek[3] = "Czwartek";
        daysOfWeek[4] = "Piątek";
        daysOfWeek[5] = "Sobota";
        daysOfWeek[6] = "Niedziela";

        System.out.println(daysOfWeek[6]);
    }

    public static void tabMnozenia() {
        for(int i=0; i<=100; i++) {
            for(int j=0; j<=100; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }

//    package com.company;
//    import java.util.Scanner;

    public class WprowadzDane {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String a;
            a = scanner.nextLine();
            System.out.print("Wprowadzono "+a);
        }
    }

    public class Dodawanie {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int a, b;
            System.out.print("Podaj a ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Podaj b ");
            b = Integer.parseInt(scanner.nextLine());

            System.out.print("Suma "+(a+b));
        }
    }
}
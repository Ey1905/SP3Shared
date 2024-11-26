import java.util.Scanner;

public class MainMenu {
    public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in); //En scanner til alt input

            //For at oprette en bruger
            System.out.println("Enter name: ");
            String name = scanner.nextLine(); //Henter navn fra brugeren
            System.out.println("Welcome " + name);


            //For at logge ind med brugernavn
            System.out.println("Log in: ");
            System.out.println("Log ind with username: ");
            String username = scanner.nextLine();

            //Skriv adgangskoden
            System.out.println("Enter paassword: ");
            String password = scanner.nextLine();

            //Kontrol for om koden virker
            if(username.equals("Nadine") && password.equals("12345678")) {
                System.out.println("Welcome back Nadine :), " + username + ".");
            } else {
                System.out.println("Invalid password or username ");
            }

            //Det er ikke så vigtig at bruge "scanner.close" i vores program, men til større projekter er det vigtigt.
            scanner.close(); //Bruges til at lukke scaneren, så den ikke bruger unødvendig systemressourcer.
        }
    }
}

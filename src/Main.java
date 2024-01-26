import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input = "";

        Container container1 = new Container();
        Container container2 = new Container();

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Ingresa el comando: ");
            input = scanner.nextLine();

            String[] parts = input.split(" ");

            String command = parts[0];

            int amount = Integer.parseInt(parts[1]);

            if(command.equals("add")) {
                container1.add(amount);
            } else if (command.equals("move")) {
                container2.add(amount);
                container1.remove(amount);
            } else if (command.equals("remove")) {
                container2.remove(amount);
            }

            System.out.println("First: " + container1 + "\nSecond: " + container2);

        }while(!input.equals("quit"));
    }
}
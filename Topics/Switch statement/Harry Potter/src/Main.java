import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String house = scanner.nextLine();
        String output;

        switch (house) {
            case "gryffindor" -> output = "bravery";
            case "hufflepuff" -> output = "loyalty";
            case "slytherin" -> output = "cunning";
            case "ravenclaw" -> output = "intellect";
            default -> output = "not a valid house";
        }
        scanner.close();
        System.out.println(output);
    }
}
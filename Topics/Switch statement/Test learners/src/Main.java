import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(
            switch (number) {
                case 1 -> "Yes!";
                case 2 -> "No!";
                case 3 -> "No!";
                case 4 -> "No!";
                default -> "Unknown number";
            }
        );
    }
}

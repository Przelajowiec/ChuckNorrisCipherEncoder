import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        scanner.close();

        int leftNuts = nuts % squirrels;
        System.out.println(leftNuts);
    }
}

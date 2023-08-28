import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multi = 1;
        for (int i = start; i < end; i++) {
            multi *= i;
        }
        System.out.println(multi);
    }
}

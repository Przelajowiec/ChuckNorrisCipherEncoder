import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sent = {0, 0, 0};
        while (n > 0) {
            int part = scanner.nextInt();
            switch (part) {
                case -1 -> sent[2] += 1;
                case 0 -> sent[0] += 1;
                case 1 -> sent[1] += 1;
                default -> sent[0] += 0;
            }
            n--;
        }
        System.out.println(sent[0] + " " + sent[1] + " " + sent[2]);
    }
}

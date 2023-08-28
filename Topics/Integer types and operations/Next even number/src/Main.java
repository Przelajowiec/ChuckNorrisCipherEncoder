import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(nextEven(num));
    }
    private static int nextEven(int number) {
        if (number % 2 == 0){
            return number +2;
        } else {
            return number + 1;
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.next());
        }
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
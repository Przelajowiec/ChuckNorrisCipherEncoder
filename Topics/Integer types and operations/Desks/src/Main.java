import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        scanner.close();

        int desks = deskCalculator(firstGroup) + deskCalculator(secondGroup)
            + deskCalculator(thirdGroup);
        System.out.println(desks);
        
    }
    
    private static int deskCalculator(int students) {
        int desks = 1;
        if (students == 0 || students > 2) {
            desks = students / 2;
            desks = students % 2 == 0 ? desks : desks + 1;
        }
        return desks;
        
    }
}

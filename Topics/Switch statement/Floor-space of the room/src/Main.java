import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        switch (shape) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                Shape tri = new Shape(a, b, c);
                tri.triangle(a, b, c);
            }
            case "rectangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                Shape rec = new Shape(a, b);
                rec.rectangle(a, b);
            }
            case "circle" -> {
                double r = scanner.nextDouble();
                Shape cir = new Shape(r);
                cir.circle(r);
            }
            default -> System.out.println("Something went wrong!");
        }
    }
}

class Shape {
    double a;
    double b;
    double c;
    double r;
    static final double PI = 3.14;
    
    public Shape(double r) {
        this.r = r;
    }
    
    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void triangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(area);
    }
    
    public static void rectangle(double a, double b) {
        System.out.println(a * b);
    }
    
    public static void circle(double r) {
        System.out.println(PI * r * r);
    }
}

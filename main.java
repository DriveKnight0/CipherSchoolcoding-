public class Main {
    public static void main(String[] args) {
        int a = 42;
        double b = 3.14;
        char c = 'A';
        boolean d = true;

        System.out.println("Initial Values:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        double aToB = a;
        int cToA = c;

        System.out.println("\nValues After Conversions:");
        System.out.println("after conversion: " + aToB);
        System.out.println("after conversion: " + cToA);
    }
}

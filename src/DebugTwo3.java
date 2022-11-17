// Demonstrates remainder and output
public class DebugTwo3 {
    public static void main(String args[]) {
        int a = 99, b = 8, result;
        long c = 7777777777777L;
        result = a % b;
//        System.out.print("Divide " + a + " by " + b);
//        System.out.println(" remainder is " + result);
//        System.out.println("c is a very large number: ");
//        System.out.print(c);
        // Shorter and simpler way could be writing it with concatenation
        System.out.println("Divide " + a + " by " + b + " remainder is " + result);
        System.out.println("c is a very large number: " + c);
    }
}

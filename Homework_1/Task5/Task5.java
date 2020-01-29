import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        int c1 = fooC("first");
        int c2 = fooC("second");
        int c3 = fooC("third");

        int t1 = fooT("first");
        int t2 = fooT("second");
        int t3 = fooT("third");

        int a = foo("First call ", c1, t1);
        int r = foo("Second call ", c2, t2);
        int c = foo("Third call ", c3, t3);

        System.out.println("Total amount " + (a + r + c));
    }

    public static int foo(String callNumber, int c, int t) {
        System.out.println(callNumber + c * t);
        return c * t;
    }

    public static int fooC(String callNumber) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Standard units per minute for the " + callNumber + " call");
        return Integer.parseInt(b.readLine());
    }

    public static int fooT(String callNumber) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Time of the " + callNumber + " call");
        return Integer.parseInt(b.readLine());
    }

}

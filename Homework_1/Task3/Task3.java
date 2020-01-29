import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Radius");
        double r = Double.parseDouble (br.readLine());
        double S = 3.14 * r * r;
        double P = 2 * 3.14 * r;
        System.out.println("Area: " + S );
        System.out.println("Perimeter: " + P );
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String pattern = "\\w{3,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        if (m.matches()) {
            System.out.print("its match");
        } else {
            System.out.println("it isn`t match");
        }

    }
}

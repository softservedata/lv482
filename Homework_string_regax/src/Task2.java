import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String s = "I want      to    study     java";

        String[] arrS = s.split("[ ]+", 5);

        for(int i = 0; i <= 4; i++){
            System.out.print(arrS[i] + " " );
        }

    }
}

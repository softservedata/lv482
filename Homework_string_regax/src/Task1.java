import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] arrS = new String[5];

        for(int i = 0; i <= 4; i++){
            arrS[i] = sc.next();
        }

//        String str = "Regular expressions are a language";
//        String[] arrS = str.split(" ", 5);

        int sLength = 0;
        int wordNumber = 0;

        for (String s : arrS){
            if(s.length() > sLength){
                sLength = s.length();
                wordNumber++;
            }
        }
        System.out.println("sLength: " + sLength);
        System.out.println("word number: " + wordNumber + " + 1");
        System.out.println("the longest word is - " + arrS[wordNumber]);

        StringBuilder strB = new StringBuilder(arrS[1]);
        System.out.println("the second word in reverse order: " + strB.reverse());
    }
}

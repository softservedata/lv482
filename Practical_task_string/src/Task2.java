public class Task2 {
    public static void main(String[] args) {
        String s1 = "Savina Oleksandra Kirilovna";

        String[] arrStr = s1.split(" ", 3);

//        for (String s : arrStr) {
//            System.out.println(s);
//        }
        String format = "%.1s";
        System.out.print(arrStr[0] + " ");
        System.out.printf(format, arrStr[1]);
        System.out.print(" ");
        System.out.printf(format, arrStr[2]);

        System.out.println();

        System.out.printf("%.10s", arrStr[1]);

        System.out.println();

        System.out.println(arrStr[1]+ " " + arrStr[2] + " " + arrStr[0]);

    }
}

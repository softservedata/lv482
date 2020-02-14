public class Task1 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Chicken();

        for (Bird b : birds) {
            System.out.println(b.getClass());
            System.out.println("I have " + b.feathers + " feathers");
            System.out.println("I can lay " + b.layEggs + " eggs");
            b.fly();
            System.out.println();


        }

    }
}

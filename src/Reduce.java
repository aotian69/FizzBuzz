public class Reduce {

    public static void main(String[] args) {

        int steps = 0;
        for (int i = 100; i > 0;) {
            boolean even = i % 2 == 0;
            if (even) {
                i = i / 2;
                steps++;
            } else {
                i = i - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}

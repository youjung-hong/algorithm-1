import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public RandomWord() {

    }
    public static void main(String[] args) {
        String answer = "";
        double p = 0;
        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            p += 1;

            if (StdRandom.bernoulli(1/p)) {
                answer = str;
            }
        }
        StdOut.println(answer);
    }
}
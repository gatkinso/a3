package Assignment4;

public class Matryoshka {
    public int f(int i) {
        if (i <= 0) {
            return 0;
        }
        return i + f(i - 1);
    }
}

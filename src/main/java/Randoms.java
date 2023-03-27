import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int diff;

    public Randoms(int min, int max) {
        this.min = min;
        this.diff = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                while (true) {
                    return (random.nextInt(diff + 1) + min);
                }
            }
        };
    }
}

import com.viktar.challenge.DistributeCandies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistributeCandiesTest {

    @Test
    public void distributeCandies() {
        final var distributeCandies = new DistributeCandies();
        int[] input = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        final var answer = distributeCandies.distributeCandies(input);
        assertEquals(3, answer);
    }

    @Test
    public void distributeCandiesEmpty() {
        final var distributeCandies = new DistributeCandies();
        int[] input = {};
        final var answer = distributeCandies.distributeCandies(input);
        assertEquals(0, answer);
    }
}
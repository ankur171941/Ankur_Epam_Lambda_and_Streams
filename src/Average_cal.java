import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average_cal {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(12, 44, 54, 95, 76);

        // OptionalDouble is a container object
        // which may or may not contain a
        // double value.
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        }
        else {
            System.out.println("-1");
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncMain {
    public static void main(String[] args) {
        double time1 = System.currentTimeMillis();
        System.out.println(RandomStrins.generateSimple());
        System.out.println(System.currentTimeMillis()-time1);

        double time2 = System.currentTimeMillis();
        System.out.println(RandomStrins.generateStream());
        System.out.println(System.currentTimeMillis()-time2);

    }

}

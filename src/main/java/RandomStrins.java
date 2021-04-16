import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStrins {
    public static List<String> generateSimple(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;

        Random random = new Random();
        List<String> randomStrings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            StringBuilder builder = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int)( random.nextFloat() * (rightLimit - leftLimit + 1));
                builder.append((char)randomLimitedInt);
            }
            randomStrings.add(builder.toString());
        }
        return randomStrings;
    }

    public static List<String>generateStream(){
        return Stream.generate(() -> new Random()
                .ints(10, 97, 122)
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining())).limit(10)
                .collect(Collectors.toList());
    }
}

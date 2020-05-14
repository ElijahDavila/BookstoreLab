import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Utils {

    public static void loadStringsToArray(ArrayList<String> arrlist) throws IOException {
        Path path = Paths.get("Bookfile.txt");
        arrlist.clear();

            try (Stream<String> lines = Files.lines(path)) {
                Object[] arr = lines.toArray();

                for (Object t : arr) {
                    arrlist.add(t.toString());
                }
            }
    }
}
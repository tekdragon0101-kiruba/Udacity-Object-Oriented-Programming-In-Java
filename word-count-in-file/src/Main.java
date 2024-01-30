import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("VikramaadheethanStories.txt");
        Scanner scanner = new Scanner(file);
        int wordsCount = 0;
        while (scanner.hasNextLine()) {
            wordsCount += scanner.nextLine().split("\\s").length;
        }
        System.out.println("Words in this file is " + wordsCount + ".");
    }
}

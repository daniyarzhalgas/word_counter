import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().trim();
        int n = scanner.nextInt();

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : str.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }
    }
}
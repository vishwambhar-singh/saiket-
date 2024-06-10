import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        String searchTerm = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();

                if (!searchTerm.isEmpty()) {
                    for (String word : words) {
                        if (word.equalsIgnoreCase(searchTerm)) {
                            System.out.println("Found \"" + searchTerm + "\" on line " + lineCount);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Line count: " + lineCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + charCount);

        System.out.print("Enter a word to search for: ");
        searchTerm = scanner.nextLine();
        System.out.println("Searching for \"" + searchTerm + "\"...");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNum = 1;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.equalsIgnoreCase(searchTerm)) {
                        System.out.println("Found \"" + searchTerm + "\" on line " + lineNum);
                    }
                }
                lineNum++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }
    }
}
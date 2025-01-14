package Week02.TutorialWeek02;

import java.io.*;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindWords {
    public static void main(String[] args)  throws IOException {
        searchWordInDirectory("Users\\mac\\Documents\\Workspace\\PR2-12-Week-Tutorials\\src", "darius");
    }

    public static void searchWordInDirectory(String directory, String word) throws IOException {
        File file = new File(directory);

        boolean exist = false;
        File[] files = file.listFiles();
        int appears = 1;
        Path basePath = Paths.get("").toAbsolutePath();

        for (File f : files) {
            if (f.isDirectory()) {
                searchWordInDirectory(f.getPath(), word);
            } else if (f.isFile()) {
                Path absPath = f.toPath().toAbsolutePath();
                Path relativePath = basePath.relativize(absPath);
                Scanner scanner = new Scanner(f);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(word)) {
                        System.out.println("Found in ./" + relativePath + " at line " + appears);
                        exist = true;
                    }
                    appears++;
                }
            }
        }

        if (!exist) {
            System.out.println('"' + word + "\" is not found in this directory!");
        }
    }
}

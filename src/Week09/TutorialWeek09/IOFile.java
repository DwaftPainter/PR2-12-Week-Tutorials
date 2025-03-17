package Week09.TutorialWeek09;

import java.io.*;

public class IOFile {
    private String fileName;

    public IOFile(String fileName) {
        this.fileName = fileName;
    }

    public int countLine() throws java.io.IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int lines = 0;
            while (br.readLine() != null) {
                lines++;
            }

            return lines;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void write(String content) throws java.io.IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(content);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void print() throws java.io.IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void copy(String fileName) throws java.io.IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void delete() throws java.io.IOException {
        try {
            java.io.File f = new java.io.File(this.fileName);
            if (f.exists()) {
                f.delete();
                System.out.println("File deleted successfully.");
                return;
            }

            System.out.println("File does not exist.");
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}

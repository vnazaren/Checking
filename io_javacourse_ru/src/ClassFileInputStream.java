import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClassFileInputStream {
    public static void main(String[] args) throws IOException {
        String filePath = "ADD/T3.txt";

        ClassFileInputStream classFileInputStream = new ClassFileInputStream();

        classFileInputStream.firstSposob(filePath);
        classFileInputStream.secondSposob(filePath);
    }

    public void firstSposob(String string) throws IOException {
        File file = new File(string);
        try (FileInputStream fileInputStream = new FileInputStream(string)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }

    public void secondSposob(String string) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(string)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }
}

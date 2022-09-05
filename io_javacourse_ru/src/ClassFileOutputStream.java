import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Formatter;

public class ClassFileOutputStream {
    public static void main(String[] args) throws IOException {
        String directoryPath = "C:\\tmp\\";
        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";

        String pathFile = String.format(directoryPath + "test%d.txt", 1);
        File file = new File(String.format(directoryPath + "test%d.txt", 2));

        ClassFileOutputStream classFileOutputStream = new ClassFileOutputStream();

        classFileOutputStream.firstSposob(file, greetings);
        classFileOutputStream.firstSposobAdd(file, greetings);
        classFileOutputStream.secondSposob(pathFile, greetings);
        classFileOutputStream.secondSposobAdd(pathFile, greetings);
    }

    public void firstSposob(File file, String text) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(text.getBytes());
        }
    }

    public void firstSposobAdd(File file, String text) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write(text.getBytes());
        }
    }

    public void secondSposob(String pathFile, String text) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathFile)) {
            fileOutputStream.write(text.getBytes());
        }
    }

    public void secondSposobAdd(String pathFile, String text) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathFile, true)) {
            fileOutputStream.write(text.getBytes());
        }
    }
}

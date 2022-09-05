import java.io.*;
import java.util.Date;

public class ClassCopyFile {
    public static void main(String[] args) throws IOException {
        String directoryPath = "C:\\tmp\\";

        String src = String.format(directoryPath + "data%d.txt", 1);
        String dest1 = String.format(directoryPath + "data%d.txt", 2);
        String dest2 = String.format(directoryPath + "data%d.txt", 3);

        new ClassCopyFile().fileInputOutputStreamCopyFile(src, dest1);
        new ClassCopyFile().fileReaderWriterInputStreamCopyFile(src, dest2);
    }

    public void fileInputOutputStreamCopyFile(String src, String dest) throws IOException {
        Date date = new Date();
        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = new byte[265_144]; // 256Кb
            while (input.available() > 0) {
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }
        }
        System.out.println("" + (new Date().getTime() - date.getTime()));
    }

    public void fileReaderWriterInputStreamCopyFile(String src, String dest) throws IOException {
        Date date = new Date();
        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dest)) {
            char[] buffer = new char[65536]; // 128Kb
            while (reader.ready()) {
                int real = reader.read(buffer);
                writer.write(buffer, 0, real);
            }
        }
        System.out.println("" + (new Date().getTime() - date.getTime()));
    }
}

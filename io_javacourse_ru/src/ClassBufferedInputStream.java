import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ClassBufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\tmp\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;
        while ((i = bufferedInputStream.read()) != -1)
            System.out.print((char) i);

        String out1 = new Main1().readFile();
        String out2 = new Main2().readFile();

        System.out.println("" + out1 + "\n" + out2);
    }

    public static class Main1 {
        public static void main(String[] args) throws IOException {

        }

        public String readFile() throws IOException {
            Date date = new Date();
            FileInputStream fileInputStream = new FileInputStream("C:\\tmp\\002.mp4");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            while ((bufferedInputStream.read()) != -1) {
            }

            return "" + (new Date().getTime() - date.getTime());
        }
    }

    public static class Main2 {
        public static void main(String[] args) throws IOException {

        }

        public String readFile() throws IOException {
            Date date = new Date();
            FileInputStream fileInputStream = new FileInputStream("C:\\tmp\\002.mp4");

            while ((fileInputStream.read()) != -1) {
            }

            return "" + (new Date().getTime() - date.getTime());
        }
    }
}

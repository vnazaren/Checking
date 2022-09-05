import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class Urllll {
/*    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }



    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru");
        URLConnection connection = url.openConnection();

// отправляем данные
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output))
        {
            sender.println("Привет");
        }

// читаем данные
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
    }
    */
public static void main(String[] args) throws IOException {
    String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
    URL url = new URL(image);
    InputStream input = url.openStream();

    Path path = Path.of("c:\\GoogleLogo1.png");
    Files.copy(input, path);
}

}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassesWriterReader
{
    public static void main(String[] args) {
        writeText();
        readText();
    }

    private static void writeText() {
        String test = "TEST !!!"; // Эту строку мы посимвольно запишем в файл

        // Создание файлового потока для записи символов ак автозакрываемый ресурс
        // Нам не надо вызывать fw.close(), т.к. в данном случае он будет закрыт автоматически
        try (FileWriter fw = new FileWriter("text1.txt")) {
            fw.write(test);

////             Записываем посимвольно , обращаясь к каждому элементу строку (как к символу)
//            for (int i = 0; i < test.length(); i++) {
//                fw.write(test.charAt(i));
//            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void readText() {
        try (FileReader fr = new FileReader("text1.txt")) {
            // Переменная для хранения строки
            StringBuilder sb = new StringBuilder();
            int code = -1;
            // Читаем посимвольно пока код считанного символа не станет равным -1
            while ((code = fr.read()) != -1) {
                // Вызов Character.toChars() преобразует int в char
                sb.append(Character.toChars(code));
            }
            System.out.println(sb.toString());

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
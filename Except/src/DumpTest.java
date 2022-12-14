import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DumpTest {
    public static void main(final String args[]) throws Exception {
        Thread.UncaughtExceptionHandler handler =
                new StackWindow("Show Exception Stack", 2000, 800);
        Thread.setDefaultUncaughtExceptionHandler(handler);
        new Thread() {
            public void run() {
                System.out.println(1 / 0);
            }
        }.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Press Enter for next exception");
        br.readLine();
        new Thread() {
            public void run() {
                System.out.println(args[0]);
            }
        }.start();
        System.out.print("Press Enter to end");
        br.readLine();
        System.exit(0);
    }
}
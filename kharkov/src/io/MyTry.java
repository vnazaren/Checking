package io;

import java.io.*;

public class MyTry {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("/Users/vnazaren/Documents/Java/JavaRushTasks/ADD/002.mp4");
             OutputStream os = new FileOutputStream("/Users/vnazaren/Documents/Java/JavaRushTasks/ADD/002-.mp4")) {
            copy(is, os);
        } catch (IOException e) {
            System.out.println("Error while copy from ... to ... ");
            e.printStackTrace();
        }
    }

    private static void copy(InputStream is, OutputStream os) {
        byte[] copyBuffer = new byte[64 * 1024];

        try (is; os) {
            while (is.read(copyBuffer) != -1)
                os.write(copyBuffer);
            os.flush();
        } catch (IOException e) {
            System.out.println("Error while copy from ... to ..." + e);
        }
    }
}

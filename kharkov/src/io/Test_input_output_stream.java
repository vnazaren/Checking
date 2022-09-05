package io;

import java.io.*;

public class Test_input_output_stream {
    public static void main(String[] args) throws IOException {
        String fileFromName = "/Users/vnazaren/Documents/Java/JavaRushTasks/Instruction.png";
        String fileToName = "/Users/vnazaren/Desktop/Instruction.png";

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(fileFromName);
            out = new FileOutputStream(fileToName);
            copy(in, out);
        } catch (IOException e) {
            throw new IOException("Exception when copy from '" + fileFromName + "' to '" + fileToName + "'", e);
        } finally {
            closeQuietly(in);
            closeAndFlushQuietly(out);
        }
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[64 * 1024];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }

    private static void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException ignore) {/*NOP*/}
        }
    }

    private static void closeAndFlushQuietly(OutputStream out) {
        if (out != null) {
            try {
                out.flush();
            } catch (IOException ignore) {/*NOP*/}
        }
    }
}

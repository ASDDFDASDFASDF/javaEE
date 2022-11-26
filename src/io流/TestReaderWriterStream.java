package io流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 字符流
 */
public class TestReaderWriterStream {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:/install-1.txt", StandardCharsets.UTF_16LE);
        FileWriter fileWriter = new FileWriter("E:/install-2.txt", StandardCharsets.UTF_16LE);

        char[] chars = new char[1024];

        int read = fileReader.read(chars);
        while (read != -1){
            fileWriter.write(chars, 0, read);
            read = fileReader.read(chars);
        }

        fileReader.close();
        fileWriter.close();

    }
}

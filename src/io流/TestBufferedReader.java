package io流;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 字符流
 */
public class TestBufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("E:/install-1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/aa.txt"));

        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            //写入当前读取到的数据信息
            bw.write(s);
            //换行
            bw.newLine();
            //读取下一行
            s = br.readLine();
        }

        br.close();
        bw.close();

    }
}

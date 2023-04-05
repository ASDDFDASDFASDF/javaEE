package io流;

import java.io.*;

/**
 * 字节流 与 字节缓冲流
 * <p>
 * 何时将输出缓冲区的内容写到磁盘
 * 1.输出缓冲区满自动写入硬盘
 * 2.close会先刷新
 * 3.手动刷新
 */

public class TestFileStream {
    public static void main(String[] args) throws IOException {

        /*字节流*/
        InputStream inputStream = new FileInputStream("E:/install.log");

        OutputStream outputStream = new FileOutputStream("E:/install-1.txt");

        byte[] bytes = new byte[1024];

        int read = inputStream.read(bytes);//此方法就是读取1014个字节到bytes中
        while (read != -1) {
            outputStream.write(bytes, 0, bytes.length);
            read = inputStream.read(bytes);
        }

        inputStream.close();
        outputStream.close();

        /*缓冲流*/

        InputStream inputStream1 = new FileInputStream("E:/install.log");
        OutputStream outputStream1 = new FileOutputStream("E:/install-2.txt");
        BufferedInputStream bis = new BufferedInputStream(inputStream1);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream1);

        byte[] b1 = new byte[1024 * 1024];
        int read1 = bis.read(b1);
        while (read1 != -1) {
            bos.write(b1, 0, read1);
            read1 = bis.read(b1);
        }
        bos.flush();
        bis.close();
        bos.close();

        /*原始写法*/
//        int len;
//        len = bis.read();
//        while (len != -1) {
//            bos.write(len);
//            len = bis.read();
//        }
//
//        bis.close();
//        bos.close();


    }
}

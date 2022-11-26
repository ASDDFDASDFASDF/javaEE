package io流;

import java.io.*;

/**
 * 复制文件夹
 */
public class TestFileCopy {
    public static void main(String[] args) throws IOException {
        String resourcePath = "E:/天天看/";
        String targetPath = "E:/IOTest/";

        copyFilder(resourcePath, targetPath);

    }

    private static void copyFilder(String resourcePath, String targetPath) throws IOException {
        File reFile = new File(resourcePath);
        if (!reFile.exists()) {
            System.out.println("源文件加必须存在");
            return ;
        }
        File taFile = new File(targetPath);
        if (!taFile.exists()) {
            taFile.mkdirs();
        }

        File[] files = reFile.listFiles();
        for (File file : files) {

            if (file.isDirectory()) {
                copyDir(resourcePath+file.getName(), targetPath+file.getName());
            } else {
                copyFile(file.getPath(), targetPath+file.getName());
            }

        }


    }

    private static void copyDir(String resourcePath, String targetPath) {

        File taFile = new File(targetPath);
        if (!taFile.exists()) {
            taFile.mkdirs();
        }


        File file = new File(resourcePath);
        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.isDirectory()) {
                copyDir(resourcePath+"/"+file1.getName(), targetPath+"/"+file1.getName());
            } else {
                copyFile(resourcePath+"/"+file1.getName(), targetPath+"/"+file1.getName());
            }
        }
    }

    private static void copyFile(String s, String targetPath) {
        s = s.replaceAll("\\\\", "/");
        File file = new File(targetPath);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetPath));

            byte[] bytes = new byte[1024*1024];
            int read = bis.read(bytes);
            while (read != -1){
                bos.write(bytes, 0 , read);
                read = bis.read(bytes);
            }
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

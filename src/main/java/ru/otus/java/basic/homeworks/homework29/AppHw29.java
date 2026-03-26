package ru.otus.java.basic.homeworks.homework29;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AppHw29 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String fileName = args[0];
        String substring = args[1];
        if (fileName == null){
            System.out.println("Не указан параметр Имя файла");
            return;
        }
        if (substring == null){
            System.out.println("Не указан параметр подстроки");
            return;
        }

        System.out.println("fileName: " + fileName);
        System.out.println("substring: " + substring);

        System.out.println("Count of "+substring+": " + countSubstringInFile(fileName, substring));
    }


    public static int countSubstringInFile(String fileName, String substring) {
        int count = 0;
        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {

            byte[] bytes = new byte[1024];
            int bytesRead;
            while((bytesRead = fileInputStream.read(bytes)) != -1) {
                String data = new String(bytes,0,bytesRead, StandardCharsets.UTF_8);
                count += countOccurrences(data, substring);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return count;
    }

    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // сдвиг, чтобы не считать перекрытия
        }
        return count;
    }
}

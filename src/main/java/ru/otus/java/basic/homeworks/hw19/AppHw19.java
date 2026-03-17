package ru.otus.java.basic.homeworks.hw19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AppHw19 {

    public static void main(String[] args) {

        String rootPath = System.getProperty("user.dir");
        FileWorker fw = new FileWorker(rootPath);
        Scanner sc = new Scanner(System.in);
        boolean isFindFile = false;
        boolean isExit = false;

        try {
            List<File> files = fw.getTextFilesFromRootDirectory();
            fw.printFiles();

            while (!isFindFile){
                System.out.print("Введите наименование файла для редактирования: ");
                File f = fw.selectFile(sc.nextLine());
                if (f == null) {
                    System.out.println("Файла не существует!");
                } else {
                    String fileContent = fw.getFileContent();
                    System.out.println(fileContent);
                    isFindFile = true;
                }
            }

            while (!isExit){
                System.out.println("Введите строку для добавления в файл. (EXIT - для выхода)");
                String newContent = sc.nextLine();
                if (newContent.equals("EXIT")) {
                    isExit = true;
                    continue;
                } else{
                    fw.addLineToFile(newContent);
                    System.out.println(fw.getFileContent());
                }
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}

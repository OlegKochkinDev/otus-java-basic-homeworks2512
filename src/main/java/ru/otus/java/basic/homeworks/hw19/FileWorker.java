package ru.otus.java.basic.homeworks.hw19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileWorker {

    private  List<File> files = new ArrayList<>();;
    private  File curFile;
    private  Path path;

    public FileWorker(String path){
        this.path = Paths.get(path);
    }

    public List<File> getTextFilesFromRootDirectory() throws IOException {
        files = new ArrayList<>();
        Stream<Path> paths = Files.walk(path);
        paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(path -> {
                        files.add(path.toFile());

                    });
            return files;
    }

    public void printFiles(){
        for (File file : files) {
            System.out.println(file.getName());
        }
    }


    public File selectFile(String fileName){
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                curFile = file;
                return file;
            }
        }
        return null;
    }

    public String getFileContent() throws IOException {
       StringBuilder sb = new StringBuilder();
       for (String line:Files.readAllLines(curFile.toPath())){
           sb.append(line);
       }
       return sb.toString();
    }

    public void addLineToFile(String line) throws IOException {

        Files.write(curFile.toPath(), (line).getBytes(), StandardOpenOption.APPEND);
    }



}

package org.example.StructuralDesignPattern.CompositDesignPattern.FileSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<FileSystem> files=new ArrayList<>();
        for(int i=0;i<5;i++){
            files.add(new File("file"+i+1));
        }
        FileSystem fileSystem=new Directory("directory1",files);
        List<FileSystem> files1=new ArrayList<>();

        files1.add(fileSystem);
        for(int i=0;i<4;i++){
            files1.add(new File("superFiles"+i+1));
        }

        FileSystem fileSystem1=new Directory("Root",files1);

        fileSystem1.ls(" ");

    }
}

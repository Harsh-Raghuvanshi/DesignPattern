package org.example.StructuralDesignPattern.CompositDesignPattern.FileSystemDesign;

import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName,List<FileSystem> fileSystemList){
        this.directoryName=directoryName;
        this.fileSystemList=fileSystemList;
    }

    @Override
    public void ls(String gap) {
        System.out.println(gap+"DIRECTORY name : "+directoryName);
        String newGap=gap+"  ";
        for(FileSystem fileSystem:fileSystemList){
            fileSystem.ls(newGap);
        }
    }
}

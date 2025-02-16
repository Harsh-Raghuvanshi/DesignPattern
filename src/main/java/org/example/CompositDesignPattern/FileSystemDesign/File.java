package org.example.CompositDesignPattern.FileSystemDesign;

public class File implements FileSystem{
    String fileName;

    public File(String fileName){
        this.fileName=fileName;
    }

    @Override
    public void ls(String gap) {
        System.out.println(gap+"FILE name : "+fileName);
    }
}

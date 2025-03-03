package org.example.OtherDesignPattern.ObjectPoolDesignPattern;

public class DbConnection {
    String dbName;
    String password;
    String role;

    public DbConnection(String dbName,String password,String role){
        this.dbName=dbName;
        this.password=password;
        this.role=role;
    }
}

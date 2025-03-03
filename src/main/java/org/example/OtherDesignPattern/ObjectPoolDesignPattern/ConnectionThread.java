package org.example.OtherDesignPattern.ObjectPoolDesignPattern;

public class ConnectionThread {
    DbConnection dbConnection;

    public ConnectionThread(DbConnection dbConnection){
        this.dbConnection=dbConnection;
    }
}

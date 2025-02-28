package org.example.InterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,Integer> map=new HashMap<>();

    void put(String variableName,Integer value){
        map.put(variableName,value);
    }

    int get(String variableName){
        return map.get(variableName);
    }
}

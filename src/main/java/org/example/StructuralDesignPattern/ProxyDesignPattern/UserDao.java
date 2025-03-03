package org.example.StructuralDesignPattern.ProxyDesignPattern;

public interface UserDao {
    void create(Role role);
    void get(Role role);
    void delete(Role role);
}

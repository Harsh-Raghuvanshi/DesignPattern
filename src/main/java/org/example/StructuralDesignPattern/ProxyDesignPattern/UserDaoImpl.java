package org.example.StructuralDesignPattern.ProxyDesignPattern;

public class UserDaoImpl implements UserDao{
    @Override
    public void create(Role role) {
        System.out.println("Something get created on Server ...");
    }

    @Override
    public void get(Role role) {
        System.out.println("Something is fetched from the Server ...");
    }

    @Override
    public void delete(Role role) {
        System.out.println("Something get deleted on the Server ...");
    }
}

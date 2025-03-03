package org.example.StructuralDesignPattern.ProxyDesignPattern;

public class Client {
    public static void main(String[] args){
//        This pattern is used when we have to do 1. Caching   2. Preprocessing or Postprocessing   3. Proxy related work
        UserDao userDao=new UserDaoImplProxy(new UserDaoImpl());
        userDao.get(Role.USER);
        userDao.create(Role.USER);
        userDao.delete(Role.ADMIN);

    }
}

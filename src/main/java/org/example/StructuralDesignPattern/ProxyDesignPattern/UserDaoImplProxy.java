package org.example.StructuralDesignPattern.ProxyDesignPattern;

public class UserDaoImplProxy implements UserDao {

    UserDao userDao;

    UserDaoImplProxy(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public void create(Role role) {
        try {
            if (role.equals(Role.USER)) {
                throw new Exception("You are not allowed to create");
            }
            userDao.create(role);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void get(Role role) {
        userDao.get(role);
    }

    @Override
    public void delete(Role role) {
        try {
            if (role.equals(Role.USER)) {
                throw new Exception("You are not allowed to delete");
            }
            userDao.delete(role);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

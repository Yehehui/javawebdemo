package cn.mju.edu.service;

import cn.mju.edu.DAO.UserDAO;
import cn.mju.edu.javabean.User;

import java.util.List;

public class UserService {
    UserDAO dao=new UserDAO();
    public List<User> getAll(){
        return dao.getAll();
    }
    public List<User> updateUser(User user){
        return dao.updateUser(user);
    }
    public List<User> deleteUser(int id){
        return dao.deleteUser(id);
    }
}

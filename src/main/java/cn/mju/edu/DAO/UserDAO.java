package cn.mju.edu.DAO;

import cn.mju.edu.javabean.User;

import java.util.LinkedList;
import java.util.List;

public class UserDAO {
    private static List<User> users=new LinkedList<>();
    static{
        users.add(new User(1,"张三","111","八戒","男","17600000001","111@qq.com"));
        users.add(new User(2,"李四","222","沙僧","女","17600000002","222@qq.com"));
        users.add(new User(3,"王五","333","悟空","男","17600000003","333@qq.com"));
    }
    public List<User> getAll(){
        return users;
    }
    public List<User> updateUser(User user){
        for(User u:users){
            if(user.getId()==u.getId()){
                u.setLoginname(user.getLoginname());
                u.setPassword(user.getPassword());
                u.setSex(user.getSex());
                u.setName(user.getName());
                u.setTel(user.getTel());
                u.setEmail(user.getEmail());
                break;
            }
        }
        return users;
    }
    public List<User> deleteUser(int id){
        for(User user:users){
            if(user.getId()==id){
                users.remove(user);
                break;
            }
        }
        return users;
    }
}

package com.example.dao;

import com.example.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    public List<UserModel> findAll(){
        List<UserModel> list = new ArrayList<>();
        list.add(new UserModel("admin","1",1));
        list.add(new UserModel("a","1",1));
        list.add(new UserModel("b","1",0));
        list.add(new UserModel("c","1",1));
        list.add(new UserModel("d","1",0));
        return list;
    }
    public UserModel checkLogin(String name,String pass){
        List<UserModel> list = findAll();
        for (UserModel item :list){
            if (item.getUsername().equals(name)
                    &&item.getPassword().equals(pass)){
                return item;
            }
        }
        return null;
    }
}

package com.yzf.customgeneric_.homework_;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork01 {
    public static void main(String[] args) {


    }
    @Test
    public void show(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,11,"tom"));
        dao.save("003",new User(3,12,"jay"));
        dao.save("004",new User(4,13,"mary"));

        dao.get("002");// tom
        dao.delete("004");//删除mary
        dao.update("001",new User(1,25,"ppo"));
        List<User> list = dao.list();
        System.out.println(list);
        
    }
}


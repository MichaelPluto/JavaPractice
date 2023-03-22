package com.yzf.mhl.service;

import com.yzf.mhl.dao.MenuDAO;
import com.yzf.mhl.domain.Menu;

import java.util.List;

public class MenuService {
    private MenuDAO menuDAO = new MenuDAO();

    //编写方法 查找数据库中的menu信息
    public List<Menu> listMenu(){
        return menuDAO.queryMulti("select * from menu ",Menu.class);
    }

    //需要方法，根据id返回Menu对象
    public Menu getMenuById(int id){
       return menuDAO.querySingle("select * from menu where menuId = ?",Menu.class,id);
    }

    //需要方法返回菜品的编号
    public Object getMenuId(int id){
        return menuDAO.queryScalar("select menuId from menu where menuId = ?", id);

    }
}

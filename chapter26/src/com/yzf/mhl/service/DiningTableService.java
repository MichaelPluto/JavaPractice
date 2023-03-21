package com.yzf.mhl.service;

import com.yzf.mhl.dao.DiningTableDAO;
import com.yzf.mhl.domain.DiningTable;

import java.util.List;

public class DiningTableService {

    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list(){
        List<DiningTable> diningTables = diningTableDAO.queryMulti("select id,state from diningTable", DiningTable.class);
        return  diningTables;
    }

    //根据id查询对应的 DiningTable对象，如果返回null 表示id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id){
        DiningTable diningTable = diningTableDAO.querySingle
                ("select * from diningTable where id = ?", DiningTable.class, id);
        return diningTable;
    }

    //如果餐桌可以预定，调用方法对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int id, String orderName, String orderTel){
        int update = diningTableDAO.update("update diningTable set state = '已经预定', orderName = ?," +
                "orderTel = ?  where id = ?", orderName, orderTel, id);
        return  update > 0;
    }
}

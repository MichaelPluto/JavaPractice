package com.yzf.mhl.service;

import com.yzf.mhl.dao.DiningTableDAO;
import com.yzf.mhl.domain.DiningTable;

import java.util.List;

public class DiningTableService {

    private DiningTableDAO diningTableDAO = new DiningTableDAO();
    //返回所有餐桌的信息
    public List<DiningTable> list(){
        List<DiningTable> diningTables = diningTableDAO.queryMulti("select * from diningTable", DiningTable.class);
        return  diningTables;
    }

    //根据id查询对应的 DiningTable对象，如果返回null 表示id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id){
        DiningTable diningTable = diningTableDAO.querySingle
                ("select * from diningTable where id = ?", DiningTable.class, id);
        return diningTable;
    }

    //返回餐桌此时状态
    public DiningTable getNowState(int id){
        return diningTableDAO.querySingle("select state from diningTable where id=?", DiningTable.class,id);

    }

    //如果餐桌可以预定，调用方法对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int id, String orderName, String orderTel){
        int update = diningTableDAO.update("update diningTable set state = '已经预定', orderName = ?," +
                "orderTel = ?  where id = ?", orderName, orderTel, id);
        return  update > 0;
    }

    //如果点餐成功，对餐桌状态进行更新
    public boolean updateDiningTableState(int id, String state){
        int update = diningTableDAO.update("update bill set state=? where diningTableId=?", state, id);
        return update > 0;
    }

    //对餐桌信息进行清空
    public boolean cleanDiningTable(int id){
        int update = diningTableDAO.update("update diningTable set state='空',orderName='',orderTel=''  where id = ?", id);
        return update > 0;
    }
}

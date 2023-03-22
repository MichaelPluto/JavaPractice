package com.yzf.mhl.service;


import com.yzf.mhl.dao.BillDAO;
import com.yzf.mhl.domain.Bill;

import java.util.List;
import java.util.UUID;

public class BillService {
    private BillDAO billDAO = new BillDAO();
    //定义 MenuService属性
    private MenuService menuService = new MenuService();
    //定义 DiningTableService属性
    private DiningTableService diningTableService = new DiningTableService();

    //1.生成账单
    //2.需要更新对应餐桌的状态
    public boolean orderMenu(int menuId, int nums, int diningTableId) {
        //生成一个账单号 UUID
        String billID = UUID.randomUUID().toString();

        //将账单生成到bill表中
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID, menuId, nums,
                menuService.getMenuById(menuId).getMenuPrice() * nums, diningTableId);
        if (update <= 0) {
            return false;
        }
        return diningTableService.updateDiningTableState(diningTableId, "就餐中");

    }

    //查询账单
    public void show(int diningTableId) {
        List<Bill> bills = billDAO.queryMulti("select * from bill where id =?", Bill.class, diningTableId);
        for (Bill bill : bills) {
            System.out.println(bill);
        }

    }

}

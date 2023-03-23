package com.yzf.mhl.service;


import com.yzf.mhl.dao.BillDAO;
import com.yzf.mhl.domain.Bill;
import com.yzf.mhl.utils.Utility;

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
        return diningTableService.updateDiningTableState(diningTableId, "未结账");

    }

    //查询账单
    public void show(int diningTableId) {
        List<Bill> bills = billDAO.queryMulti("select * from bill where diningTableId =?", Bill.class, diningTableId);
        for (Bill bill : bills) {
            System.out.println(bill);
        }
        
    }

    //查看某个餐桌是否有未结账的账单
    public boolean hasPay(int diningTableId){
        Bill bill = billDAO.querySingle("select * from bill where diningTableId =? and state = '未结账' limit 0,1", Bill.class, diningTableId);
        if (bill == null){
            return false;
        }else {
            return true;
        }
    }

    //将账单记录删除
    public boolean delete(int diningTableId){
        int update = billDAO.update("delete from bill where diningTableId = ?", diningTableId);
        return update > 0;
    }
}

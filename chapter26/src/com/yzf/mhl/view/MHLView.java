package com.yzf.mhl.view;

import com.yzf.mhl.domain.DiningTable;
import com.yzf.mhl.domain.Employee;
import com.yzf.mhl.service.DiningTableService;
import com.yzf.mhl.service.EmployeeService;
import com.yzf.mhl.utils.Utility;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 主界面
 */
public class MHLView {
    public static void main(String[] args) {
        new MHLView().view();
    }
    private boolean loop = true;
    private String  key = "";
    //定义EmployeeService对象
    private EmployeeService employeeService = new EmployeeService();
    //定义DiningTableService对象
    private DiningTableService diningTableService = new DiningTableService();
    //显示主菜单

    public void view(){
        do {
            System.out.println("==========满汉楼==========");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key){
                case "1":
                    showView01();
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
        System.out.println("退出了满汉楼系统");
    }
    public void showView01(){
        System.out.print("请输入员工号: ");
        String empId = Utility.readString(50);
        System.out.print("请输入密码: ");
        String pwd = Utility.readString(50);
        Employee emp = employeeService.getEmployeeByIdAbdPwd(empId, pwd);
        if (emp != null){
            System.out.println("==========登录成功" + "[" + emp.getName()+"]" + "==========");
            do {
                System.out.println("==========满汉楼二级菜单==========");
                System.out.println("\t\t 1 显示餐桌状态");
                System.out.println("\t\t 2 预定餐桌");
                System.out.println("\t\t 3 显示所有菜品");
                System.out.println("\t\t 4 点餐服务");
                System.out.println("\t\t 5 查看账单");
                System.out.println("\t\t 6 结账");
                System.out.println("\t\t 9 退出满汉楼");
                System.out.print("请输入你的选择: ");
                key = Utility.readString(1);
                switch (key){
                    case "1":
                        showList();
                        break;
                    case "2":
                        orderDiningTable();
                        break;
                    case "3":
                        System.out.println("=显示所有菜品=");
                        break;
                    case "4":
                        System.out.println("=点餐服务=");
                        break;
                    case "5":
                        System.out.println("=查看账单=");
                        break;
                    case "6":
                        System.out.println("=结账=");
                        break;
                    case "9":
                        loop = false;
                        break;
                    default:
                        System.out.println("输入有误");
                }
            }while (loop);
        }else {
            System.out.println("============登录失败============");
        }
    }

    //显示餐桌状态
    public void showList(){
        System.out.println("=显示餐桌状态=");
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable table : list) {
            System.out.println(table);
        }
        System.out.println("=============显示完毕============\n");
    }

    //完成订座
    public void orderDiningTable(){
        System.out.println("=============预定餐桌============");
        System.out.print("请选择要预定的餐桌编号(-1退出): ");
        int orderId = Utility.readInt();
        if (orderId == -1){
            System.out.println("=============取消预定============");
            return;
        }
        char key = Utility.readConfirmSelection();
        if (key == 'Y'){

            //根据orderId 返回DiningTable对象 如果为null就说明对象不存在
            DiningTable diningTable = diningTableService.getDiningTableById(orderId);
            if (diningTable == null){
                System.out.println("=============预定餐桌失败============\n");
                return;
            }
            if (!("空".equals(diningTable.getState()))){
                System.out.println("=============预定餐桌失败============\n");
                return;
            }

            System.out.print("预定人姓名: ");
            String orderName = Utility.readString(10);
            System.out.print("预定人电话: ");
            String orderTel = Utility.readString(10);
            boolean order = diningTableService.orderDiningTable(orderId, orderName, orderTel);
            System.out.println(order ? "预定成功":"预定失败");

        }else {
            System.out.println("=============取消预定============");
        }
    }
}

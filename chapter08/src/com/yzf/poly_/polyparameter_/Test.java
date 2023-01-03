package com.yzf.poly_.polyparameter_;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Employee[] employees = new Employee[3];
        employees[0] = new Ordinary("jack" , 10000);
        employees[1] = new Ordinary("tom" , 15000);
        employees[2] = new Mannager("mike" , 35000 , 5000);
        test.showEmpAnnual(employees[0]);
        test.showEmpAnnual(employees[1]);
        test.showEmpAnnual(employees[2]);
        test.testWork(employees[0]);
        test.testWork(employees[1]);
        test.testWork(employees[2]);
    }
    public void showEmpAnnual(Employee e){//将父类对象作为形参传进去 可以直接接收不同子类对象实现多态
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof Ordinary){
            ((Ordinary) e).work();
        }else if(e instanceof Mannager){
            ((Mannager) e).manage();
        }else {
            System.out.println("========");
        }
    }
}

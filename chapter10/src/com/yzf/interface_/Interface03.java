package com.yzf.interface_;

public class Interface03 {
    public static void main(String[] args) {
        DBMysql dbMysql = new DBMysql();
        tool(dbMysql);
        DBOracle dbOracle = new DBOracle();
        tool(dbOracle);
        DB2 db2 = new DB2();
        tool(db2);
    }
    public static void tool(DBInterface db){
        db.connect();
        db.close();
        System.out.println("==========");
    }
}


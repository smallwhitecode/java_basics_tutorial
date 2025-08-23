package com.hspedu.interface_;

/**
 * @Author:李强
 * @Date:2025/3/16
 * @Description:chapter10
 */

public class Interface03 {
    public static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}

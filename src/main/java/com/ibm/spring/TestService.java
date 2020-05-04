package com.ibm.spring;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class TestService {

   /* @Resource(name="oracleDS")
    private DataSource oracleDS;*/

    @Resource(name="mysqlDS")
    private DataSource mysqlIDS;

   /* public void showOrcaleInfo() {

        try {
            Connection oracon = oracleDS.getConnection();
            DatabaseMetaData oradbmd = oracon.getMetaData();
            System.out.println(oradbmd.getDatabaseProductName());
            System.out.println(oradbmd.getDefaultTransactionIsolation());

        } catch (Exception e) {

            e.printStackTrace();

        }
    }*/

        public void showMySQLInfo()
        {
            try
            {
                Connection mycon = mysqlIDS.getConnection();
                DatabaseMetaData mydbmd = mycon.getMetaData();
                System.out.println(mydbmd.getDatabaseProductName());
                System.out.println(mydbmd.getDefaultTransactionIsolation());
            }

            catch (Exception e)
            {
                e.printStackTrace();

            }
        }

    }


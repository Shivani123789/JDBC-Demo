package com.stackroute;

import com.stackroute.jdbcdemo.DataManger;
import com.stackroute.jdbcdemo.DatabaseMetaDataDemo;
import com.stackroute.jdbcdemo.JdbcBatchProcessingDemo;
import com.stackroute.jdbcdemo.ResultSetMetaDataDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DataManger dataManger=new DataManger();
        dataManger.getAllStudent();
        DatabaseMetaDataDemo databaseMetadataDemo = new DatabaseMetaDataDemo();
        databaseMetadataDemo.getDatabaseMetaData();

        ResultSetMetaDataDemo resultSetMetaDataDemo = new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.getResultSetMetaData();

        JdbcBatchProcessingDemo jdbcBatchProcessingDemo = new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.getJdbcBatchProcessing();
    }

}


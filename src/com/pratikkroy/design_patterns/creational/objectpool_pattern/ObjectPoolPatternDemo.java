package com.pratikkroy.design_patterns.creational.objectpool_pattern;

import com.pratikkroy.design_patterns.creational.objectpool_pattern.object_pool.JDBCConnectionPool;
import com.pratikkroy.design_patterns.creational.objectpool_pattern.reusable_product.JDBCConnection;

public class ObjectPoolPatternDemo {
    public static void demo(){
        System.out.println();
        System.out.println("Object pool pattern existing_use.....");
        JDBCConnectionPool connectionPool = JDBCConnectionPool.getInstance();

        JDBCConnection connection = new JDBCConnection();

        try{
            connectionPool.acquireReusable(connection);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        try{
            connectionPool.acquireReusable(connection);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        // do all the tasks

        System.out.println("Object pool capacity " + connectionPool.getPoolCapacity());
        System.out.println("Object pool size " + connectionPool.getPoolSize());

        connectionPool.releaseResuable();
    }
}

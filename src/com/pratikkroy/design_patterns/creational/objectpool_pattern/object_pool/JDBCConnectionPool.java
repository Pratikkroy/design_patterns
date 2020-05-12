package com.pratikkroy.design_patterns.creational.objectpool_pattern.object_pool;

import com.pratikkroy.design_patterns.creational.objectpool_pattern.reusable_product.JDBCConnection;

import java.util.ArrayDeque;

public class JDBCConnectionPool implements ReusableObjectPool {

    private static JDBCConnectionPool  instance;
    private ArrayDeque<JDBCConnection> reusableObjectsQueue;
    private static final int MAX_SIZE = 10;

    private JDBCConnectionPool(){
        reusableObjectsQueue = new ArrayDeque<>();
    }

    public static JDBCConnectionPool getInstance(){
        if(instance == null){
            // if instance is null then acquire lock on this class so that
            // no other thread can create instance during this time.
            synchronized (JDBCConnectionPool.class){
                if(instance == null){
                    instance = new JDBCConnectionPool();
                }
            }
        }
        return instance;
    }

    @Override
    synchronized public void acquireReusable(JDBCConnection jdbcConnection) throws Exception{
        if(reusableObjectsQueue.size() >= MAX_SIZE){
            throw new ReusableObjectPoolMaxedOut();
        }
        reusableObjectsQueue.push(jdbcConnection);
    }

    @Override
    synchronized public void releaseResuable() {
        if(reusableObjectsQueue.size()>0)
            reusableObjectsQueue.pop();
    }

    public int getPoolSize(){
        return reusableObjectsQueue.size();
    }

    public int getPoolCapacity(){
        return MAX_SIZE;
    }
}

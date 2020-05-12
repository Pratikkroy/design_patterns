package com.pratikkroy.design_patterns.creational.objectpool_pattern.object_pool;

import com.pratikkroy.design_patterns.creational.objectpool_pattern.reusable_product.JDBCConnection;

public interface ReusableObjectPool {
    void acquireReusable(JDBCConnection jdbcConnection) throws Exception;

    void releaseResuable();
}

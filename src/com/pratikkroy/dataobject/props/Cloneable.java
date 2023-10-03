package com.pratikkroy.dataobject.props;

import java.io.Serializable;

public interface Cloneable<SELF extends Serializable> {

    SELF deepClone();

    SELF shallowClone();
}

package com.pratikkroy.dataobject.props;

import com.pratikkroy.dataobject.JsonObject;

import java.io.Serializable;

public interface JsonSerializable extends Serializable {

    JsonObject serialize();

    JsonObject beautify();
}

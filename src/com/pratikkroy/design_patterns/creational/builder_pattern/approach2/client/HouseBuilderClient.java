package com.pratikkroy.design_patterns.creational.builder_pattern.approach2.client;

import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.HouseBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl.HouseWithGarageBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.builder.impl.HouseWithPoolBuilder;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.director.HouseBuilderDirector;
import com.pratikkroy.design_patterns.creational.builder_pattern.approach2.product.House;

public class HouseBuilderClient {

    public House getHouse(String type){
        HouseBuilderDirector director = new HouseBuilderDirector();

        HouseBuilder builder = null;
        if(type.equalsIgnoreCase("POOL")){
            HouseWithPoolBuilder houseWithPoolBuilder = new HouseWithPoolBuilder();
            director.makeHouseWithPool(houseWithPoolBuilder);
            builder = (HouseBuilder) houseWithPoolBuilder;
        }
        else if(type.equalsIgnoreCase("GARAGE")){
            HouseWithGarageBuilder houseWithGarageBuilder = new HouseWithGarageBuilder();
            director.makeHouseWithGarage(houseWithGarageBuilder);
            builder = (HouseBuilder) houseWithGarageBuilder;
        }

        return builder.getHouse();

    }


}

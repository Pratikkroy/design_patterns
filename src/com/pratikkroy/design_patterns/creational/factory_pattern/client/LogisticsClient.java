package com.pratikkroy.design_patterns.creational.factory_pattern.client;

import com.pratikkroy.design_patterns.creational.factory_pattern.Item;
import com.pratikkroy.design_patterns.creational.factory_pattern.creator.Logistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.creator.impl.RoadLogistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.creator.impl.SeaLogistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;

/**
 * Ideally this class should be singleton and only return Transport for a given item.
 */
public class LogisticsClient {
    public void deliverItem(Item item){

        Logistics logistics = this.getLogistics(item);

        logistics.createTransport().deliver();
    }

    private Logistics getLogistics(Item item){

        switch(item.getDelievrBy()){
            case "SEA":
                return new SeaLogistics();

            case "ROAD":
                return new RoadLogistics();

            default:
                return new RoadLogistics();
        }

    }

    public Transport getTransport(Item item){
        Logistics logistics = this.getLogistics(item);
        return logistics.createTransport();
    }
}

package com.pratikkroy.design_patterns.creational.factory_pattern.director;

import com.pratikkroy.design_patterns.creational.factory_pattern.Item;
import com.pratikkroy.design_patterns.creational.factory_pattern.factory.Logistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.factory.impl.RoadLogistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.factory.impl.SeaLogistics;
import com.pratikkroy.design_patterns.creational.factory_pattern.product.Transport;

/**
 * Ideally this class should be singleton.
 * This class could only return Transport for a given component
 * and then ExporterClient can call deliver on that.
 */
public class LogisticsDirector {

    private final Item item;

    public LogisticsDirector(Item item){
        this.item = item;
    }

    public void deliverItem(){

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

    public Transport getTransport(){
        Logistics logistics = this.getLogistics(item);
        return logistics.createTransport();
    }
}

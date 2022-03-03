package com.test.platformsciencetask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainModel {
    List<String> shipmentsList;
    List<String> driversList;

    public List<String> getShipmentsList() {
        if(shipmentsList == null){
            shipmentsList = new ArrayList<>();
            shipmentsList.add("215 Osinski Manors");
            shipmentsList.add("9856 Marvin Stravenue");
            shipmentsList.add("7127 Kathlyn Ferry");
            shipmentsList.add("987 Champlin Lake");
            shipmentsList.add("63187 Volkman Garden Suite 447");
            shipmentsList.add("75855 Dessie Lights");
            shipmentsList.add("1797 Adolf Island Apt. 744");
            shipmentsList.add("2431 Lindgren Corners");
            shipmentsList.add("8725 Aufderhar River Suite 859");
            shipmentsList.add("79035 Shanna Light Apt. 322");
        }
        return shipmentsList;
    }

    public List<String> getDriversList() {
        if(driversList == null) {
            driversList = new ArrayList<>();
            driversList.add("Everardo Welch");
            driversList.add("Orval Mayert");
            driversList.add("Howard Emmerich");
            driversList.add("Izaiah Lowe");
            driversList.add("Monica Hermann");
            driversList.add("Ellis Wisozk");
            driversList.add("Noemie Murphy");
            driversList.add("Cleve Durgan");
            driversList.add("Murphy Mosciski");
            driversList.add("Kaiser Sose");
        }
        return driversList;
    }
}

package designpatterns.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class StateDemo {

    public static void runDemo(){
        System.out.println("-------------------------State demo------------------------------");
        DirectionService directionService = new DirectionService();
        Driving driving = new Driving();
        Walking walking = new Walking();

        List<TravelMode> travelModeList = new ArrayList<>();
        travelModeList.add(driving);
        travelModeList.add(walking);

        for (TravelMode t : travelModeList
             ) {
            directionService.setTravelMode(t);
            System.out.println(directionService.getDirection());
            System.out.println(directionService.getEta());
        }

    }
}

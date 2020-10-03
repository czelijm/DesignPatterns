package designpatterns.behavioral.state;

//public enum TravelMode {
//    DRIVING,
//    BICYCLING,
//    TRANSIT,
//    WALKING
//}

public abstract class TravelMode{
    public int mode = 0;
    public String name = "";
    public  int calculateETA(){
        System.out.println("Calculating ETA ("+name+")");
        return mode;
    }
    public int calculateDirection(){
        System.out.println("Calculating Direction ("+name+")");
        return mode;
    }
}
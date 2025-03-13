package Week_17.Bus;
import java.util.ArrayList;
public class BusCompany {
//    instance array list
    ArrayList <Bus> busList = new ArrayList<>();
//    constrictor
    BusCompany() {

    }
//    adding but to list
    public void addBusToList(Bus bus) {
        this.busList.add(bus);
    }
//    removing bus from list
    public void removeBusFromList(Bus bus) {
        try{
        this.busList.remove(bus);
        }
        catch (Exception e) {
            System.out.println("error in removeBusFromList");
        }

    }
    //    display bus detail based on method call
    private void displayDetailBasedCond(Bus bus) {
        System.out.println("Number plate is : "+bus.numberPlate);
        System.out.println("Color"+ bus.color);
        System.out.println("Route"+ bus.route);
        System.out.println("Customer Name"+bus.customerName);
        System.out.println("Status"+ bus.avialableStatus);
        System.out.println("Route"+ bus.rate);
    }
//    display bus all detail
    public void displayAllBuses() {
        System.out.println("displaying all buses");
        for (Bus bus : busList) {
            displayDetailBasedCond(bus);
        }
    }
//    display bus detail > 500
    public void displayHighRateBuses(){
        System.out.println("bus details are more than 500");
        for (Bus bus : busList) {
            if(bus.rate >= 500){
                displayDetailBasedCond(bus);
            }
        }
    }

//    display bus by color
    public void displayBusesByColor(String color) {
        System.out.println("bus details by color");
            for (Bus bus : busList) {
                if(bus.color.equals(color)){
                    displayDetailBasedCond(bus);
                }
            }
    }
}

package Week_17.Bus;
public class Bus {
//    instance variable
    String numberPlate;
    String color;
    String route;
    String customerName;
    Boolean avialableStatus;
    int rate;

//    constructor
    public Bus(String numberPlate, String color, String route, String customerName, Boolean avialableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.avialableStatus = avialableStatus;
        this.rate = rate;
    }
//    getter methods
    public String getColor() {
        return color;
    }

    public String getRoute() {
        return route;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Boolean getAvialableStatus() {
        return avialableStatus;
    }

    public int getRate() {
        return rate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }
//    setter methods
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAvialableStatus(Boolean avialableStatus) {
        this.avialableStatus = avialableStatus;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}

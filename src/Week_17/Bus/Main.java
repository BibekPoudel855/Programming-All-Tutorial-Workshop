package Week_17.Bus;
public class Main {
    public static void main(String[] args) {
//        creating company obj
        BusCompany company1 = new BusCompany();
//        creating bus obj
        Bus obj1= new Bus("ga1kha", "red", "pkr to ktm", "Bibek Inc", true, 500);
        Bus obj2= new Bus("ga2kha", "green", "pkr to bagar", "abc Inc", false, 400);
        Bus obj3= new Bus("ga3kha", "blue", "pkr to simpani", "def Inc", true, 600);
        Bus obj4= new Bus("ga4kha", "pink", "pkr to icp", "ghi Inc", false, 800);
        Bus obj5= new Bus("ga5kha", "yellow", "pkr to usa", "klm Inc", true, 100);
//        adding to object
        company1.addBusToList(obj1);
        company1.addBusToList(obj2);
        company1.addBusToList(obj3);
        company1.addBusToList(obj4);
        company1.addBusToList(obj5);

//        displaying details
        company1.displayAllBuses();
        company1.displayBusesByColor("red");
        company1.displayHighRateBuses();
//        removing object
        company1.removeBusFromList(obj4);

    }
}

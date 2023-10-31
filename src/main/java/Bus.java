import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public boolean addPassenger(Person person){
        if(this.getPassengerCount() < this.capacity) {
            this.passengers.add(person);
        }
        return false;
    }

    public void pickUpPassenger(BusStop busStop, Person person){
        if(this.addPassenger(person)){
            busStop.removeFromQueue(person);
        }
    }

    public void removePassenger(Person person){
        if (!this.passengers.contains(person)) {
            return;
        }
        this.passengers.remove(person);

    }
}

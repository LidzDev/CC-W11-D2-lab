import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public void addToQueue(Person person){
        this.queue.add(person);
    }

    public int getQueueSize(){
        return this.queue.size();
    }

    public void removeFromQueue(Person person) {
        this.queue.remove(person);
    }
}

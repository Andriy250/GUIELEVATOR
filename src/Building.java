import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Building {
    private Floor[] floors;
    private int numberOfFloors;
    private ArrayList<Person> crowd; // i ga

    public static int B_WIDTH = 1350;
    public static int B_HEIGHT = 1350;

    public Building(){
        numberOfFloors = 5;
        crowd = new ArrayList<>();
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; ++i){
            floors[i] = new Floor(numberOfFloors, i + 1 );
        }
    }

    public void addPerson(){

        int fromFloor = ThreadLocalRandom.current().nextInt(1, 5);
        int toFloor =0;
        do{
            toFloor = ThreadLocalRandom.current().nextInt(1, 5);
        } while (fromFloor == toFloor);
        crowd.add(new Person(floors[fromFloor],floors[toFloor]));
    }

    public Person getPerson(int i){return crowd.get(i);}
    public int getSizeOfCrowd(){
        try {
            return crowd.size();
        } catch (Exception ex) {return 0;}
    }
}

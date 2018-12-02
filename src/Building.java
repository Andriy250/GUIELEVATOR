public class Building {
    private Floor[] floors;
    private int numberOfFloors;

    public static int B_WIDTH = 1350;
    public static int B_HEIGHT = 1350;

    public Building(){
        numberOfFloors = 5;
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; ++i){
            floors[i] = new Floor(numberOfFloors, i + 1 );
        }
    }
}

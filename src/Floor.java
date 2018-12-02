public class Floor {
    private boolean door = false; //true = open | false = close
    private int y;
    private int idFloor, numberOfFloors;
    private static int width = 5 * Building.B_WIDTH / 6;
    private static int height ;


    public Floor(int _numberOfFloors, int _idFloor){
        numberOfFloors = _numberOfFloors;
        height = Building.B_HEIGHT /  numberOfFloors;
        idFloor = _idFloor;
        y = height * idFloor;
    }

    public void openDoor(){ door = true; }

    public int getIdFloor(){ return idFloor; }

    public int getY(){ return y; }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

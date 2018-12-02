import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Person {
    private double weight;
    private Image image;
    private Floor fromFloor, toFloor;
    private static int id;
    private int x,y;
    private int height, width;

    public Person(Floor _fromFloor, Floor _toFloor){
        /*fromFloor = ThreadLocalRandom.current().nextInt(1, 5);
        do{
            toFloor = ThreadLocalRandom.current().nextInt(1, 5);
        } while (fromFloor == toFloor);*/

        fromFloor = _fromFloor;
        toFloor = _toFloor;

        id++;
        ImageIcon ii = new ImageIcon("src/boy.png");
        image = ii.getImage();
        weight = ThreadLocalRandom.current().nextDouble(45.0, 150.0);

        height =Building.B_HEIGHT / 10;
        width = Building.B_WIDTH/ 10;

    }

    public void move(){  // paint?

    }

    public int getId(){
        return id;
    }

}

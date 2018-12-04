import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
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

        fromFloor = _fromFloor;
        toFloor = _toFloor;



        id++;
        ImageIcon ii = new ImageIcon("src/boy.png");
        Image tempImage = ii.getImage();

        weight = ThreadLocalRandom.current().nextDouble(45.0, 150.0);

        height = Building.B_HEIGHT / 10;
        width = Building.B_WIDTH/ 10;

        y = _fromFloor.getY() - height;
        x = 0;

        image = tempImage.getScaledInstance(width,height, Image.SCALE_SMOOTH);
    }

    public void move(){
        x += 4;
        //y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId(){
        return id;
    }

    public Image getImage() {
        return image;
    }

    public int getFloorNumber(){
        return fromFloor.getIdFloor();
    }

    public void draw(Graphics g, JPanel observer){
        g.drawImage(image,x ,y, observer);
    }
}

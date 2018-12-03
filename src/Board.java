import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import java.util.TimerTask;
import java.util.Timer;*/

public class Board extends JPanel implements ActionListener {
    private final int B_WIDTH = 1350;
    private final int B_HEIGHT = 1080;
    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 500;

    private Image boy; // hz moje star
    private Timer timer;
    private int x,y;

    private Building building;

    public Board(){
        initBoard();
        building = new Building();
        building.addPerson();
        building.addPerson();
        System.out.println(building.getPerson(0).getY()+ " " + building.getPerson(-0).getFloorNumber()+ "     " + building.getPerson(1).getY()+ " " + building.getPerson(1).getFloorNumber());
        //Floor fl = new Floor();
        System.out.println(Building.B_WIDTH / 6);
    }

    private void initBoard(){
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));


        timer = new Timer(DELAY, this);

        timer.start();

    }

    private void loadImage(){
        ImageIcon ii = new ImageIcon("src/boy.png");
        boy = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        drawBoy(g);
    }

    private void drawBoy(Graphics g){
        for (int i = 0; i < building.getSizeOfCrowd(); ++i){
            g.drawImage(building.getPerson(i).getImage(),building.getPerson(i).getX(),building.getPerson(i).getY(),this);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //building.addPerson();
       for(int i = 0; i < building.getSizeOfCrowd(); ++i){
           building.getPerson(i).move();
       }

        this.repaint();
    }
}

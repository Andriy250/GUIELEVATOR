import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel{
    private final int B_WIDTH = 1350;
    private final int B_HEIGHT = 980;
    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 500;

    private Image boy; // hz moje star
    private Timer timerMove, timerAddPerson;
    private int x,y;

    private int counter;

    private Building building;

    public Board(){
        initBoard();
        building = new Building();
        building.addPerson();
        //Floor fl = new Floor();
        System.out.println(Building.B_WIDTH / 6);
    }

    private void initBoard(){
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));


        timerMove = new Timer();
        timerMove.schedule(new MoveTask(this), 0, 500);
        timerAddPerson  = new Timer();
        timerAddPerson.schedule(new AddPeopleTask(this),1000, 5000);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        building.draw(g,this);
    }


    class MoveTask extends TimerTask{

        private Board board;

        public MoveTask(Board _board){super(); board = _board; }

        @Override
        public void run() {
            for(int i = 0; i < building.getSizeOfCrowd(); ++i){
                building.getPerson(i).move();
            }
            board.repaint();
        }
    }

    class AddPeopleTask extends TimerTask{
        private Board board;

        public AddPeopleTask (Board _board) {super(); board = _board;}

        @Override
        public void run() {
            building.addPerson();
            board.repaint();
        }
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        building.addPerson();
       for(int i = 0; i < building.getSizeOfCrowd(); ++i){
           building.getPerson(i).move();
       }
        //building.addPerson();
        this.repaint();
    }*/
}

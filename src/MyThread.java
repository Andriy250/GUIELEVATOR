import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*import java.util.TimerTask;
import java.util.Timer;*/

public class MyThread extends Thread implements  ActionListener{

    private Timer timer;
    private Person person;
    private Board board;

    private final int DELAY = 500;

    public MyThread(String name, Board _board, Person _person){
        super(name);
        board = _board;
        //timer = new Timer(DELAY, board);
        person = _person;
    }

    @Override
    public void run() {
        timer.start();
        while(true){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //building.addPerson();

        board.repaint();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    private final int B_WIDTH = 1350;
    private final int B_HEIGHT = 1350;
    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 25;

    private Image boy; // hz moje star
    private Timer timer;
    private int x,y;

    public Board(){
        initBoard();
    }

    private void initBoard(){
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));

        loadImage();

        x = INITIAL_X;
        y = INITIAL_Y;

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
        g.drawImage(boy,x,y,this);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x += 2;
        y += 2;

        if ( y > B_HEIGHT - 500){
            y = INITIAL_Y;
            x = INITIAL_X;
        }

        this.repaint();
    }
}

import javax.swing.*;
import java.awt.*;

public class JGUI extends JFrame {

    public JGUI(){
        initUI();
    }

    private void initUI(){
        this.add(new Board());

        this.setResizable(false);
        this.pack();

        this.setTitle("Boy");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JGUI gui = new JGUI();
            gui.setVisible(true);
        });
    }
}

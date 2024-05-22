package list1.prac12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RectangleAnimation extends JPanel implements ActionListener {
    private int x = 0;
    private int frame = 0;
    private Timer timer;
    private static final int RECTANGLE_WIDTH = 50;
    private static final int RECTANGLE_HEIGHT = 50;
    public RectangleAnimation() {
        timer = new Timer(100, this);
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        int numFrames = 5;
        frame = (frame + 1) % numFrames;
        x = (getWidth() - RECTANGLE_WIDTH) * frame / numFrames;
        g.setColor(Color.RED);
        g.fillRect(x, (getHeight() - RECTANGLE_HEIGHT) / 2, RECTANGLE_WIDTH, RECTANGLE_HEIGHT);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Анимация прямоугольника");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new RectangleAnimation());
            frame.setSize(400, 200);
            frame.setVisible(true);
        });
    }
}
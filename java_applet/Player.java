import java.awt.*;

public class Player {
    private int x;
    private int y;

    public void update(MainClass mc) {

    }

    public void paint(Graphics g) {

        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

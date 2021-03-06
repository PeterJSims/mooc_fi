
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawingBoard extends JPanel {
    private final Figure figure;

    public DrawingBoard(Figure figure) {
        super();
        super.setBackground(Color.WHITE);
        this.figure = figure;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        figure.draw(graphics);
    }

}

package BoardElements.Fruit;

import BoardElements.Fruit.Fruit;

import java.awt.*;

public class Chest extends Fruit {
    public Chest(int xPosition, int yPosition) {
        super(xPosition, yPosition);
    }

    @Override
    public void paint(Graphics2D g, int step, int widthPadding, int heightPadding) {
        g.setColor(new Color(150, 75, 0));
        g.fillRect(getXPosition() * step + widthPadding, getYPosition() * step + heightPadding, step, step);

        super.paint(g, step, widthPadding, heightPadding);
    }
}

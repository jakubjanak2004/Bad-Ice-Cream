package BoardElements.Fruit;

import BoardElements.BoardElement;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fruit extends BoardElement {

    private boolean taken = false;
    private Color color;

    public Fruit(int xPosition, int yPosition) {
        super(xPosition, yPosition);
        this.color = Color.DARK_GRAY;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void paint(Graphics2D g, int step, int widthPadding, int heightPadding) {
        // Fruit Block size: 35 * 31
        int width = step / 2;
        int height = (int) (width / (35.0/31.0));

        int x = getXPosition() * step + widthPadding;
        int y = getYPosition() * step + heightPadding;
        int xPaddingInBlock = (step - width) / 2;
        int yPaddingInBlock = (step - height) / 2;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("/Users/jakubjanak/Desktop/SIT/S2/PJV/BadIcecream/src/main/java/Assets/Orange.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        g.drawImage(img, x + xPaddingInBlock, y + yPaddingInBlock, width, height, null);
    }
}

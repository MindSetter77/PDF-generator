package panels;

import javax.swing.border.AbstractBorder;
import java.awt.*;

class CustomeBorder extends AbstractBorder {
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y,
                            int width, int height) {
        // TODO Auto-generated method stub
        super.paintBorder(c, g, x, y, width, height);
        g.setColor(Color.black);
        g.drawRoundRect(x, y, width, height, 20, 20);
    }

}

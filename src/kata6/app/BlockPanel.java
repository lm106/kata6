package kata6.app;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import kata6.model.Block;
import kata6.view.BlockDisplay;

/**
 *
 * @author Luzma
 * @version 9-12-2020
 * @since Práctica de Laboratorio
 */
public class BlockPanel extends JPanel implements BlockDisplay{
    private static final int size = 100;
    private Block block;
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        int m = Block.MAX * size;
        for (int i = 0; i <= 7; i++) {
            int d = i* size;
            g.drawLine(0, d, m, d);
            g.drawLine(d, 0, d, m);
            
        }
        if(block == null) return;
        g.setColor(Color.RED);
        g.fillRect((block.x() -1)*size, (Block.MAX - block.y())*size, size, size);
    }

    @Override
    public void display(Block block) {
        this.block = block;
        this.repaint();
    }

    @Override
    public void changed() {
        this.repaint();
    }
}

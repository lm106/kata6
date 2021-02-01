package kata6.view;

import kata6.model.Block;

/**
 *
 * @author Luzma
 * @version 9-12-2020
 * @since Práctica de Laboratorio
 */
public interface BlockDisplay extends Block.Observer{
    public void display(Block block);
}

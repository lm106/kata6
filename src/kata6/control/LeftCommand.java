package kata6.control;

import kata6.model.Block;

/**
 *
 * @author Luzma
 * @version 9-12-2020
 * @since Práctica de Laboratorio
 */
public class LeftCommand implements Command{
    private final Block block;

    public LeftCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute() {
        block.left();
    }
    
}

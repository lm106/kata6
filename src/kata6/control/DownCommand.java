package kata6.control;

import kata6.model.Block;

/**
 *
 * @author Luzma
 * @version 9-12-2020
 * @since Práctica de Laboratorio
 */
public class DownCommand implements Command{
    private final Block block;

    public DownCommand(Block block) {
        this.block = block;
    }
    @Override
    public void execute() {
        block.down();
    }
    
}

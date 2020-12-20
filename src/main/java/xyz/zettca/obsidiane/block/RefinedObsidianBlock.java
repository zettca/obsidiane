package xyz.zettca.obsidiane.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class RefinedObsidianBlock extends Block {
    public RefinedObsidianBlock() {
        super(FabricBlockSettings.of(Material.METAL).hardness(60.0f));
    }

    public RefinedObsidianBlock(Settings settings) {
        super(settings);
    }
}

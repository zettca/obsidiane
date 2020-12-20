package xyz.zettca.obsidiane.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CompressedObsidianBlock extends Block {
    public CompressedObsidianBlock() {
        super(FabricBlockSettings.of(Material.METAL).hardness(60.0f));
    }

    public CompressedObsidianBlock(Settings settings) {
        super(settings);
    }
}

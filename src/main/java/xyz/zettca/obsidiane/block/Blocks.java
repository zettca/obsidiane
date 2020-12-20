package xyz.zettca.obsidiane.block;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.CryingObsidianBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static xyz.zettca.obsidiane.Obsidiane.NS;

public class Blocks {
    public static final Block COMPRESSED_OBSIDIAN;
    public static final Block REFINED_OBSIDIAN;

    static {
        COMPRESSED_OBSIDIAN = register("compressed_obsidian", new Block(Settings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(50.0F, 1200.0F)));
        REFINED_OBSIDIAN = register("refined_obsidian", new CryingObsidianBlock(Settings.of(Material.STONE, MaterialColor.BLACK).requiresTool().strength(50.0F, 1200.0F).luminance((state) -> 10)));
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(NS, id), block);
    }
}

package xyz.zettca.obsidiane.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.zettca.obsidiane.Materials;
import xyz.zettca.obsidiane.block.Blocks;
import xyz.zettca.obsidiane.item.Builder.*;

import static xyz.zettca.obsidiane.Obsidiane.NS;

public class Items {
    public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(NS, "general"), () -> new ItemStack(Blocks.COMPRESSED_OBSIDIAN));

    // Items
    public static final Item OBSIDIAN_SWORD;
    public static final Item OBSIDIAN_AXE;
    public static final Item OBSIDIAN_PICKAXE;
    public static final Item OBSIDIAN_SHOVEL;
    public static final Item OBSIDIAN_HOE;

    // BlockItems
    public static final Item REFINED_OBSIDIAN;
    public static final Item COMPRESSED_OBSIDIAN;

    static {
        // Items
        OBSIDIAN_SWORD = register("obsidian_sword", (new Sword(Materials.OBSIDIAN, 3, -2.4F)));
        OBSIDIAN_SHOVEL = register("obsidian_shovel", (new Shovel(Materials.OBSIDIAN, 1.5F, -3.0F)));
        OBSIDIAN_PICKAXE = register("obsidian_pickaxe", (new Pickaxe(Materials.OBSIDIAN, 1, -2.8F)));
        OBSIDIAN_AXE = register("obsidian_axe", (new Axe(Materials.OBSIDIAN, 5.0F, -3.0F)));
        OBSIDIAN_HOE = register("obsidian_hoe", (new Hoe(Materials.OBSIDIAN, -3, 0.0F)));

        // BlockItems
        REFINED_OBSIDIAN = register(Blocks.REFINED_OBSIDIAN);
        COMPRESSED_OBSIDIAN = register(Blocks.COMPRESSED_OBSIDIAN);
    }

    private static Item register(Block block) {
        return register(new BlockItem(block, new Item.Settings().group(GROUP)));
    }

    private static Item register(BlockItem item) {
        return register(item.getBlock(), item);
    }

    protected static Item register(Block block, Item item) {
        return register(Registry.BLOCK.getId(block), item);
    }

    private static Item register(String id, Item item) {
        return register(new Identifier(NS, id), item);
    }

    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registry.ITEM, id, item);
    }

    private static Settings group() {
        return new Settings().group(GROUP);
    }

}

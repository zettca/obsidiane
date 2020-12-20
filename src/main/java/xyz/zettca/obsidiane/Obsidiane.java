package xyz.zettca.obsidiane;

import net.fabricmc.api.ModInitializer;
import xyz.zettca.obsidiane.block.Blocks;
import xyz.zettca.obsidiane.item.Items;

public class Obsidiane implements ModInitializer {
    public static String NS = "obsidiane";

    @Override
    public void onInitialize() {
        // Load Items and Blocks
        new Items();
        new Blocks();

        System.out.println("Obsidiane loaded!");
    }
}

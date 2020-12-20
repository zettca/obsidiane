package xyz.zettca.obsidiane.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class Pickaxe extends PickaxeItem {

    protected Pickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}

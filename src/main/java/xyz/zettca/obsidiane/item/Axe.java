package xyz.zettca.obsidiane.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class Axe extends AxeItem {

    protected Axe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

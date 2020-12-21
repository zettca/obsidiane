package xyz.zettca.obsidiane.item;

import net.minecraft.item.*;

public class Builder {
    private static final Item.Settings settings = new Item.Settings().group(Items.GROUP);

    public static class Axe extends AxeItem {
        protected Axe(ToolMaterial material, float attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class Hoe extends HoeItem {
        protected Hoe(ToolMaterial material, int attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class Pickaxe extends PickaxeItem {
        protected Pickaxe(ToolMaterial material, int attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class Shovel extends ShovelItem {
        protected Shovel(ToolMaterial material, float attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    public static class Sword extends SwordItem {
        protected Sword(ToolMaterial material, int attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

}

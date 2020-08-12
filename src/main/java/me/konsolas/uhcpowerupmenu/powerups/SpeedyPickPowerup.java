package me.konsolas.uhcpowerupmenu.powerups;

import me.konsolas.uhcpowerupmenu.UHCPowerupMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class SpeedyPickPowerup extends AbstractPowerup {
    private static final ItemStack SPEEDY_PICK = new ItemStack(Material.STONE_PICKAXE);
    static {
        ItemMeta pickMeta = Objects.requireNonNull(SPEEDY_PICK.getItemMeta());
        pickMeta.setDisplayName(ChatColor.GOLD + "Speedy pick");
        pickMeta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        SPEEDY_PICK.setItemMeta(pickMeta);
    }

    public SpeedyPickPowerup(UHCPowerupMenu plugin) {
        super(plugin, Material.STONE_PICKAXE, true, 5, "Speedy Pick", "Mine super fast!");
    }

    @Override
    public void apply(Player target) {
        super.apply(target);
        giveItems(target, SPEEDY_PICK);
    }
}

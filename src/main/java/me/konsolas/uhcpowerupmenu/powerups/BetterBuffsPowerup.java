package me.konsolas.uhcpowerupmenu.powerups;

import me.konsolas.uhcpowerupmenu.UHCPowerupMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BetterBuffsPowerup extends AbstractPowerup {

    public BetterBuffsPowerup(UHCPowerupMenu plugin) {
        super(plugin, Material.BREWING_STAND, true, -1, "Better Buffs", // -1 for custom cost calculation
                "Speed III for 30 seconds",
                "Strength III for 30 seconds",
                "Resistance III for 30 seconds",
                "Wither II for 15 seconds",
                ChatColor.RED + "Cuts 70% of current health");
    }

    @Override
    public void apply(Player target) {
        target.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
        target.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 2));
        target.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
        target.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
        target.setHealthScale(target.getHealth() * 0.3);
        target.sendMessage(ChatColor.BOLD + "Power Overwhelming!");
    }
}

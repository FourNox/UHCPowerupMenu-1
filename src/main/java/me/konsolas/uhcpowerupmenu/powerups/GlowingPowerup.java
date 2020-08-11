package me.konsolas.uhcpowerupmenu.powerups;

import me.konsolas.uhcpowerupmenu.UHCPowerupMenu;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GlowingPowerup extends AbstractPowerup {
    public GlowingPowerup(UHCPowerupMenu plugin) {
        super(plugin, Material.SPECTRAL_ARROW, false, 3, "Glowing",
                "Applies the 'glowing' debuff for 10 seconds to all players near the user");
    }
    @Override
    public void apply(Player target) {
        for(Entity entity : target.getNearbyEntities(32, 256, 32)) {
            if(entity instanceof Player) {
                Player found = (Player) entity;
                if (found != target){
                    found.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 200, 0));
                }
            }
        }
    }
}

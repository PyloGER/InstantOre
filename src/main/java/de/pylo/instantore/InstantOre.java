package de.pylo.instantore;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class InstantOre implements Listener {

    @EventHandler
    public void onBreak1(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (event.getBlock().getType() == Material.IRON_ORE) {
            if (player.getItemInHand().getType() == Material.STONE_PICKAXE ||
                player.getItemInHand().getType() == Material.IRON_PICKAXE ||
                player.getItemInHand().getType() == Material.DIAMOND_PICKAXE ||
                player.getItemInHand().getType() == Material.NETHERITE_PICKAXE) {
                event.setDropItems(false);
                ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
                player.getInventory().addItem(iron);
            }
        }
    }
    @EventHandler
    public void onBreak2(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (event.getBlock().getType() == Material.GOLD_ORE) {
            if (player.getItemInHand().getType() == Material.IRON_PICKAXE ||
                player.getItemInHand().getType() == Material.DIAMOND_PICKAXE ||
                player.getItemInHand().getType() == Material.NETHERITE_PICKAXE) {
                event.setDropItems(false);
                ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
                player.getInventory().addItem(gold);
            }
        }
    }
}

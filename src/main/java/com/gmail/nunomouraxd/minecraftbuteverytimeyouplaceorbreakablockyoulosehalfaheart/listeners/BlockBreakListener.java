package com.gmail.nunomouraxd.minecraftbuteverytimeyouplaceorbreakablockyoulosehalfaheart.listeners;

import com.gmail.nunomouraxd.minecraftbuteverytimeyouplaceorbreakablockyoulosehalfaheart.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {

    //================================================================================
    // Properties
    //================================================================================

    private Main plugin;

    //================================================================================
    // Constructors
    //================================================================================

    public BlockBreakListener(Main plugin) {
        this.plugin = plugin;
    }

    //================================================================================
    // Events
    //================================================================================

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        Player player = event.getPlayer();
        player.damage(.5);
    }
}

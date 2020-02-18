package com.gmail.nunomouraxd.minecraftbuteverytimeyouplaceorbreakablockyoulosehalfaheart;

import com.gmail.nunomouraxd.minecraftbuteverytimeyouplaceorbreakablockyoulosehalfaheart.listeners.BlockBreakListener;
import com.gmail.nunomouraxd.minecraftbuteverytimeyouplaceorbreakablockyoulosehalfaheart.listeners.BlockPlaceListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Load listeners
        getServer().getPluginManager().registerEvents(new BlockBreakListener(this), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(this), this);
    }
}

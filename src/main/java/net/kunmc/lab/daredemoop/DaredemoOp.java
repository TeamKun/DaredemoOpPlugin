package net.kunmc.lab.daredemoop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DaredemoOp extends JavaPlugin implements Listener
{

    @Override
    public void onEnable()
    {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        if (!e.getPlayer().isOp())
        {
            e.getPlayer().setOp(true);
            Bukkit.broadcastMessage(ChatColor.GREEN + e.getPlayer().getName() + " にOPを付与しました！");
        }
    }
}

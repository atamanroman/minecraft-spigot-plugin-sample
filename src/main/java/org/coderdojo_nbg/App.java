package org.coderdojo_nbg;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Echo 'HIT' on ProjectileHitEvent
 */
public class App extends JavaPlugin implements Listener {

  @Override
  public void onDisable() {
    getServer().broadcastMessage("-- NINJA DISABLE --");
  }

  @Override
  public void onEnable() {
    getServer().broadcastMessage("-- NINJA ENABLE --");
    getServer().getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onHit(ProjectileHitEvent ev) {
    System.out.println("HIT");
  }
}

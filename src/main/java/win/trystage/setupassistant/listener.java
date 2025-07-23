package win.trystage.setupassistant;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class listener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack item = event.getItem();
        if (item == null || !item.hasItemMeta()) return;
        String displayName = item.getItemMeta().getDisplayName();
        switch (displayName) {
            case "§a坐标对齐":
                player.performCommand("setup tp");
                event.setCancelled(true);
                break;
            case "§a设置队伍出生点":
                player.performCommand("bw setspawn");
                event.setCancelled(true);
                break;
            case "§a设置商店":
                player.performCommand("bw setshop");
                event.setCancelled(true);
                break;
            case "§a设置升级":
                player.performCommand("bw setupgrade");
                event.setCancelled(true);
                break;
            case "§a设置资源池":
                player.performCommand("bw addgenerator");
                event.setCancelled(true);
                break;
            case "§a设置床":
                player.performCommand("bw setbed 1");
                event.setCancelled(true);
                break;
            case "§a传送到等待区1":
                player.performCommand("tp 15 150 15 135 0");
                event.setCancelled(true);
                break;
            case "§a传送到等待区2":
                player.performCommand("tp -15 150 -15 -45 0");
                event.setCancelled(true);
                break;
        }
    }
    @EventHandler
    public void onPlayerWorldSwitch(PlayerChangedWorldEvent event){
        event.getPlayer().getWorld().setGameRuleValue("doFireTick", "false");
        event.getPlayer().getWorld().setGameRuleValue("randomTickSpeed", "false");
    }
}

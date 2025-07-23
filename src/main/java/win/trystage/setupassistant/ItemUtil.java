package win.trystage.setupassistant;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemUtil {
    public static void giveSetupItem(Player player){
        player.getInventory().setItem(0, customItem("§a设置队伍出生点","SEA_LANTERN",(short) 0));
        player.getInventory().setItem(1, customItem("§a设置商店","MONSTER_EGG",(short) 120));
        player.getInventory().setItem(2, customItem("§a设置升级","DIAMOND",(short) 0));
        player.getInventory().setItem(3, customItem("§a设置资源池","IRON_INGOT",(short) 0));
        player.getInventory().setItem(4, customItem("§a设置床","BED",(short) 0));
        player.getInventory().setItem(5, customItem("§a传送到等待区1","LOG",(short) 0));
        player.getInventory().setItem(6, customItem("§a传送到等待区2","LOG", (short) 1));
        player.getInventory().setItem(7, customItem("§a坐标对齐","IRON_SPADE",(short) 0));
        player.getInventory().setItem(8, customItem("§a快速传送","COMPASS",(short) 0));
    }
    public static ItemStack customItem(String name, String materialName, short data){
        Material material = Material.getMaterial(materialName);
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemStack.setItemMeta(itemMeta);
        itemStack.setDurability(data);
        return itemStack;
    }
}

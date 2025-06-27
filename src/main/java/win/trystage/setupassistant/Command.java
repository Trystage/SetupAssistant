package win.trystage.setupassistant;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {
        if (!commandSender.hasPermission("setup.admin")){
            return false;
        }
        if (args.length == 0){
            commandSender.sendMessage(ChatColor.RED + "Usage: /setup tp");
            return true;
        }
        if (args.length == 1){
            if (args[0].equalsIgnoreCase("tp")){
                if (commandSender instanceof Player){
                    Player player = (Player) commandSender;
                    Location location = player.getLocation().clone();
                    location.setX(MathUtil.roundToHalf(location.getX()));
                    location.setY(MathUtil.roundToHalf(location.getY()));
                    location.setZ(MathUtil.roundToHalf(location.getZ()));
                    location.setPitch(MathUtil.roundTo45s(location.getPitch()));
                    location.setYaw(MathUtil.roundTo45s(location.getYaw()));
                    player.teleport(location);
                }else{
                    commandSender.sendMessage(ChatColor.RED + "Only player can run this command");
                }
            }
            return true;
        }
        return false;
    }
}

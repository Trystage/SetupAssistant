package win.trystage.setupassistant;

import org.bukkit.plugin.java.JavaPlugin;

public final class SetupAssistant extends JavaPlugin {

    public static SetupAssistant instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        getCommand("setupassist").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new listener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

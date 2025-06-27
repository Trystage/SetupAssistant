package win.trystage.setupassistant;

import org.bukkit.plugin.java.JavaPlugin;

public final class SetupAssistant extends JavaPlugin {

    public static SetupAssistant instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        getCommand("setup").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

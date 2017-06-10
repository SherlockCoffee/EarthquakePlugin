package coffee.sherlock.earthquakeplugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level


class EarthquakePlugin: JavaPlugin() {

    companion object {
        var instance: EarthquakePlugin? = null
        private set
    }

    override fun onEnable() {
        instance = this

        Bukkit.getLogger().log(Level.INFO, description.fullName + " v" + description.version + " enabled.")
    }

    override fun onDisable() {
        instance = this

        Bukkit.getLogger().log(Level.INFO, description.fullName + " v" + description.version + " disabled.")
    }

}
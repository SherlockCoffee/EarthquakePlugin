package coffee.sherlock.earthquakeplugin

import coffee.sherlock.earthquakeplugin.command.EarthquakeCommand
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Level


class EarthquakePlugin : JavaPlugin() {

    companion object {
        var instance: EarthquakePlugin? = null
            private set
    }

    override fun onEnable() {
        instance = this

        setupExecutorsAndListeners()

        Bukkit.getLogger().log(Level.INFO, "${description.fullName} enabled.")
    }

    override fun onDisable() {
        instance = this

        Bukkit.getLogger().log(Level.INFO, "${description.fullName} disabled.")
    }

    fun setupExecutorsAndListeners() {
        // Set Command Executors Here
        getCommand("earthquake").setExecutor(EarthquakeCommand)

        // Register Listeners Here
    }

}
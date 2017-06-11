package coffee.sherlock.earthquakeplugin.core

import coffee.sherlock.earthquakeplugin.EarthquakePlugin
import coffee.sherlock.earthquakeplugin.task.EarthquakeTask
import org.bukkit.Bukkit
import org.bukkit.Location


class Earthquake {

    companion object {
        fun create(hypocenter: Location, severity: Int) {
            Bukkit.broadcastMessage("$hypocenter $severity")
            //TODO Create an earthquake

            EarthquakeTask(hypocenter, severity).runTaskTimer(EarthquakePlugin.instance, 4L, 0L)
        }
    }

}
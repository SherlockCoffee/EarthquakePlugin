package coffee.sherlock.earthquakeplugin.task

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitRunnable
import java.util.*

class EarthquakeTask(location: Location, severity: Int) : BukkitRunnable() {

    override fun run() {
        val players: HashSet<Player> = HashSet()
        for (player in Bukkit.getOnlinePlayers()) {
            players.add(player)
        }





    }

}
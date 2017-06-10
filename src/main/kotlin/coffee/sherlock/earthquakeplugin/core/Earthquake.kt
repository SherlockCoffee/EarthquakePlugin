package coffee.sherlock.earthquakeplugin.core

import org.bukkit.Bukkit
import org.bukkit.Location


class Earthquake(var hypocenter: Location,
                 var severity: Int) {

    init {
        Bukkit.broadcastMessage("$hypocenter $severity")
        //TODO Create an earthquake
    }

}
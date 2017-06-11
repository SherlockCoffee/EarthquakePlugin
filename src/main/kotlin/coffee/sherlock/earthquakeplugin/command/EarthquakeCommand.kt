package coffee.sherlock.earthquakeplugin.command

import coffee.sherlock.earthquakeplugin.core.Earthquake
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player


object EarthquakeCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean {
        if (sender!!.hasPermission("earthquake.create")) {
            if (args?.size == 2) {
                try {
                    val target: Player = Bukkit.getPlayer(args[0])
                    val severity: Int = Integer.parseInt(args[1])

                    Earthquake.create(target.location, severity)
                } catch (ex: Exception) {
                    sender.sendMessage("${ChatColor.RED} Usage of this command is: /earthquake <target> <severity>")
                }
            }
        } else {
            sender.sendMessage("${ChatColor.RED} You don't have enough permission.")
        }

        return true
    }

}
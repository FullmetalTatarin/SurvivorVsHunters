package SurvVsHunts;

import org.bukkit.event.Listener;


public class stage4_end implements Listener {
    main plugin;

    // Stage start
    public stage4_end(main plugin) {
        this.plugin = plugin;
        if (plugin.surv_player == "") {
            plugin.say("hunters_win");
        } else {
            plugin.say("survivor_wins");
        };
        // Play sound
        for(int i=0; i<=2; i++)
            plugin.getServer().getScheduler().runTaskLater(plugin, () -> {
                plugin.gongBang();
            }, i * 15);
    }

}

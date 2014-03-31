#What is ActionX
ActionX is a [Bukkit](http://bukkit.org "Bukkit") plugin, this plugin adds methods for you execute actions on events.

Example of KitVIP, NoSay and JoinKit:

>     Event:

>       CommandEvent:

>         '*': []

>         say:

>         - set:ax nomsg;null;null;

>         kitvip:

>         - cmd:give @player DIAMOND 64;console;ax.kit.vip

>         - msg:§3You has gained kit VIP;ax.kit.vip

>       PlayerJoinEvent:

>         '*': []

>         firstJoin:

>         - cmd:give @player DIAMOND 24;console;ax.kit.vip

>         - msg:Thank you for playing.;ax.kit.vip

>         Player: []
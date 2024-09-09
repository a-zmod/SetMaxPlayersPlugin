package org.azmod.setmaxplayers.command;

import com.avrix.commands.*;
import com.avrix.enums.AccessLevel;
import com.avrix.enums.CommandScope;
import org.azmod.setmaxplayers.Main;
import zombie.core.raknet.UdpConnection;
import zombie.core.znet.SteamGameServer;


@CommandName("setmaxplayers")
@CommandAccessLevel(AccessLevel.ADMIN)
@CommandExecutionScope(CommandScope.BOTH)
@CommandDescription("/setmaxplayers #")

public class SetMaxPlayers extends Command {
    private Main main;


    public SetMaxPlayers(Main m){
        super();
        main = m;
    }

    /**
     * Performing a chat command action
     *
     * @param playerConnection {@link UdpConnection}, if called from the console, the connection will return as {@code null}
     * @param args             arguments of the received command
     */
    @Override
    public String onInvoke(UdpConnection playerConnection, String[] args) {
        if(args.length < 1) {
            return this.getDescription();
        }

        try {

            int players = Integer.parseInt(args[0]);

            SteamGameServer.SetMaxPlayerCount(players);

            return ""+players;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return "false";

    }
}

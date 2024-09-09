package org.azmod.setmaxplayers;

import com.avrix.commands.CommandsManager;

import com.avrix.plugin.Metadata;
import com.avrix.plugin.Plugin;
import org.azmod.setmaxplayers.command.SetMaxPlayers;

/**
 * org.azmod.setmaxplayers.Main entry point of the example plugin
 */
public class Main extends Plugin {

    /**
     * Constructs a new {@link Plugin} with the specified metadata.
     * Metadata is transferred when the plugin is loaded into the game context.
     *
     * @param metadata The {@link Metadata} associated with this plugin.
     */
    public Main(Metadata metadata) {
        super(metadata);
    }

    /**
     * Called when the plugin is initialized.
     * <p>
     * Implementing classes should override this method to provide the initialization logic.
     */
    @Override
    public void onInitialize() {


        CommandsManager.addCommand(new SetMaxPlayers(this));
    }
}
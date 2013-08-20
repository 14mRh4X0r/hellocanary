/*
 * Copyright (C) 2013 Willem Mulder
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.canarymod.example.hellocanary;

import net.canarymod.chat.Colors;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

/**
 * Commands!
 */
public class Commands implements CommandListener {

    // Commands are detected by the Command annotation, which is also used to
    // provide info on the command.
    @Command(aliases = "hello", description = "Displays \"Hello Canary!\"",
            permissions = {}, toolTip = "/hello")
    public void handleHello(MessageReceiver caller, String[] arguments) {
        // Send the caller a nice message.
        caller.message(Colors.ORANGE + "Hello Canary!");
    }

}

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

import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.logger.Logman;
import net.canarymod.plugin.Plugin;

/**
 * Hello world!
 */
public class HelloCanary extends Plugin {
    // Get a nice logger, Logman automatically adds in the plugin prefix
    private final Logman LOG = Logman.getLogman(this.getName());

    @Override
    public boolean enable() {
        // Register the commands with the command system
        try {
            Canary.commands().registerCommands(new Commands(), this, false);
        } catch (CommandDependencyException ex) {
            LOG.logStacktrace("Unexpected exception", ex);
            return false;
        }

        // No need to log an enable message; Canary does this for us
        return true;
    }

    @Override
    public void disable() {
        // Commands are automatically unregistered, nothing to do here
        // Again, Canary logs the disable message
    }
}

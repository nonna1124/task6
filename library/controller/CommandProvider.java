package by.htp.les17.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.impl.AddBook;
import by.htp.les17.library.command.impl.Logination;
import by.htp.les17.library.command.impl.Registration;


final class CommandProvider {
	final private Map<String, Command> commands = new HashMap<>();

	CommandProvider() {
		commands.put("LOGINATION", new Logination());
		commands.put("REGISTRATION", new Registration());
		commands.put("ADD_NEW_BOOK", new AddBook());
	}

	Command getCommand(String commandName) {
		Command command = commands.get(commandName);
		return command;
	}

}

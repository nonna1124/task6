package by.htp.les17.library.command;

import by.htp.les17.library.command.exception.CommandException;

public interface Command {
	String execute(String request) throws CommandException;

}

package by.htp.les17.library.command.impl;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.exception.CommandException;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.ServiceFactory;

public class GetBook implements Command {
	
	@Override
	public String execute(String request) throws CommandException {
		String result = "";

		try {
			result = ServiceFactory.getInstance().getUpdateLibraryService().getAllBook();
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		return result;
	}

}

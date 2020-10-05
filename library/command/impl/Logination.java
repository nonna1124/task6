package by.htp.les17.library.command.impl;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.exception.CommandException;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.ServiceFactory;

public class Logination implements Command {

	@Override
	public String execute(String request) throws CommandException {

		String login;
		String password;
		boolean adult;
		String result ="Login not found!";
		String[] params = request.split("\\s+");
		 
		 if (params.length==4) {
			 login=params[1];
			 password=params[2];
			 adult=Boolean.valueOf(params[3]);
		 }
		 
		 if (params.length==3) {
			 login=params[1];
			 password=params[2];
			 adult=true;
		 }
		 
		 else {
			 throw new CommandException("It's wrong!");
		 }
		 try {
			 result=ServiceFactory.getInstance().getUserService().logination(login, password, adult);
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		 
		return result ;
		
	}
}

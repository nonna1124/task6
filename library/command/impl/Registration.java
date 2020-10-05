package by.htp.les17.library.command.impl;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.exception.CommandException;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.ServiceFactory;

public class Registration implements Command {

	@Override
	public String execute(String request) throws CommandException {
		String login="";
		String password="";
		boolean adult=false;
		String result ="Not registered!";
		
		String[] params = request.split("\\s+");
		 
		 if (params.length==4) {
			 login=params[1];
			 password=params[2];
			 adult=Boolean.valueOf(params[3]);
			 result ="You  was registrated!";
		 }
		 
		 if (params.length==3) {
			 login=params[1];
			 password=params[2];
			 adult=true;
			 result ="You  was registrated!";
		 }
		 

		 try {
			 ServiceFactory.getInstance().getUserService().registerUser(login, password, adult);
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		return result;
	}

}

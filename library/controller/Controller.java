package by.htp.les17.library.controller;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.exception.CommandException;

public class Controller {
private final CommandProvider provider = new CommandProvider();
	
	
	public String doAction(String request){
		
		
		String commandName = request.split("\\s+")[0];
		String response= "";
	
		try {
			Command command = provider.getCommand(commandName);
			response = command.execute(request);
		} catch (CommandException e) {
			response = "Wrong";
		}
		
		return response;
	}

}

package by.htp.les17.library.command.impl;

import by.htp.les17.library.command.Command;
import by.htp.les17.library.command.exception.CommandException;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.ServiceFactory;

public class AddBook  implements Command{
	
	@Override

		public String execute(String request) throws CommandException {
			 String title="";
			 String type="";
			 boolean adult=true;
			 String result="";
			 
			 String[] params = request.split("\\s+");
			 
			 if (params.length==4) {
				 title=params[1];
				 type=params[2];
				 adult=Boolean.valueOf(params[2]);
			 }
			 
			 if (params.length==3) {
				 title=params[1];
				 type=params[2];
				 adult=true;
			 }
			 
			 if (params.length==1) {
				 title=params[0];
				 type="";
				 adult=true;
			 }
			 try {
				 result =ServiceFactory.getInstance().addBook(title, type, adult);
			} catch (ServiceException e) {
				throw new CommandException(e);
			}
			 
			return  result;
		}
	}


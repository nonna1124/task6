package by.htp.les17.library.service.impl;

import by.htp.les17.library.dao.DAOFactory;
import by.htp.les17.library.dao.UserDao;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public void logination(String login, String password) throws ServiceException {

		DAOFactory daoFactory = DAOFactory.getInstance();
		UserDao userDAO = daoFactory.getUserDAO();
	}	

}

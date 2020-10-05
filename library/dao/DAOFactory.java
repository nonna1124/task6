package by.htp.les17.library.dao;

import by.htp.les17.library.impl.BookDaoImpl;
import by.htp.les17.library.impl.UserDaoImpl;

public class DAOFactory {
	
		private static final DAOFactory instance = new DAOFactory();	
		private UserDao userDAO = new UserDaoImpl();
		private BookDao bookDAO = new BookDaoImpl();
		
		public DAOFactory(){}
		
		public static DAOFactory getInstance(){
			return instance;
		}
		
		public UserDao getUserDAO(){
			return userDAO;
		}
		
		public BookDao getBookDAO(){
			return bookDAO;
		}

}

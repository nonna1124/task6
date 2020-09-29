package by.htp.les17.library.dao;

import by.htp.les17.library.bean.User;
import by.htp.les17.library.dao.exception.DAOException;

public interface UserDao {
	
	public User user(String login,String password,boolean adult) throws DAOException;
	public User logination(String login, String password,boolean adult) throws DAOException;
    
}

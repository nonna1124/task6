package by.htp.les17.library.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import by.htp.les17.library.bean.User;
import by.htp.les17.library.dao.UserDao;
import by.htp.les17.library.dao.exception.DAOException;

public class UserDaoImpl implements UserDao {
	static String file = "User.txt";
	FileWriter writer;
	BufferedReader reader;
   
    
	@Override
	public User user(String login, String password, boolean adult) throws DAOException {

		User user = new User(login, password, adult);
		String result=null;
		
		try {
			writer = new FileWriter(file, true);

			writer.write(user.toString()+"\n");
			result="Welcome!";

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				writer.close();

			} catch (IOException e) {
				throw new DAOException(e);
			}
		}

		return result;
	}

	@Override
	public User logination(String login, String password, boolean adult) throws DAOException {
		String line;
		User user = new User(login, password, adult);
		String result = "User not found!";
		try {
			reader = new BufferedReader(new FileReader(file));

			while ((line = reader.readLine()) != null) {

				if ((line).equals(user.toString())) {
					result = "Welcome!";
				}

			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (NullPointerException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new DAOException(e);
			}

		}

		return result;
	}

}


package by.htp.les17.library.dao;

import by.htp.les17.library.bean.Book;
import by.htp.les17.library.dao.exception.DAOException;

public interface BookDao {
	
	public String addBook(Book book) throws DAOException;
	public String getBook() throws DAOException;
}
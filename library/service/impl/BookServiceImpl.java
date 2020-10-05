package by.htp.les17.library.service.impl;

import by.htp.les17.library.bean.Book;
import by.htp.les17.library.dao.BookDao;
import by.htp.les17.library.dao.DAOFactory;
import by.htp.les17.library.dao.exception.DAOException;
import by.htp.les17.library.service.ServiceException;
import by.htp.les17.library.service.UpdateLibraryService;

public class BookServiceImpl implements UpdateLibraryService {

		@Override
		public String addBook(String title, String type, boolean adult) throws ServiceException {

			Book book = new Book(title, type, adult);
			String result = "";

			DAOFactory daoFactory = new DAOFactory();
			BookDao bookDao = daoFactory.getBookDAO();
			try {
				result = bookDao.addBook(book);
			} catch (DAOException e) {
				throw new ServiceException(e);
			}
			return result;
		}


}

package by.htp.les17.library.service;

public interface UpdateLibraryService {
	void addNewBook(String title, int price) throws ServiceException;

	String addBook(String title, String type, boolean adult) throws ServiceException;

}

package by.htp.les17.library.service;

import by.htp.les17.library.service.impl.BookServiceImpl;
import by.htp.les17.library.service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private UpdateLibraryService updateLibraryService = new BookServiceImpl();
    private UserService userService = new UserServiceImpl();


    public ServiceFactory(){}

    public static ServiceFactory getInstance(){
	return instance;
    }


    public UpdateLibraryService getUpdateLibraryService(){
	return updateLibraryService;
    }

    public UserService getUserService(){
	return userService;
    }
}
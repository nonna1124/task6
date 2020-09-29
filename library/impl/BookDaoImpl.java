package by.htp.les17.library.impl;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.les17.library.bean.Book;
import by.htp.les17.library.dao.BookDao;
import by.htp.les17.library.dao.exception.DAOException;

public class BookDaoImpl implements BookDao{
	FileWriter writer;
	BufferedReader reader;
	private static final String fileName = "books.txt";
	 
	@Override
	public void addBook(Book book) throws DAOException {
		
		FileWriter out;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			
			out = new FileWriter(fileName, true);
			bw = new BufferedWriter(out);
			pw = new PrintWriter(bw);
			pw.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear()+" " + book.getNumString()+" " + book.getStile()+ "\n");
			
		} catch (IOException e) {
			throw new DAOException("IOError", e);
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		boolean res=false;
	}	
	
		
	
	@Override
	public String getBook() throws DAOException {
		String allBook="";
		String line="";
		
		try {
			reader = new BufferedReader(new FileReader(fileName));

			while ((line = reader.readLine()) != null) {
				
					allBook += (line + "\n");
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
		
		
		return allBook;
	}
	}
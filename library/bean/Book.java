package by.htp.les17.library.bean;

public class Book {
	private String title;
	private String author;
	private int year;
	private String stile;
	private int numString;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStile() {
		return stile;
	}

	public void setStile(String stile) {
		this.stile = stile;
	}

	public int getNumString() {
		return numString;
	}

	public void setNumString(int numString) {
		this.numString = numString;
	}

	
	public Book(String title, String author, int year, String stile, int numString, boolean lock) {
		
		this.title = title;
		this.author = author;
		this.year = year;
		this.stile = stile;
		this.numString = numString;
		
	}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stile == null) ? 0 : stile.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + numString;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (stile == null) {
			if (other.stile != null)
				return false;
		} else if (!stile.equals(other.stile))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (numString != other.numString)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", Stile=" + stile + ", numString="
				+ numString + "]";
	}
	

}

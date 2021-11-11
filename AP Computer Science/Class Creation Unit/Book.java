public class Book {
// Instances
	private String title;
	private String genre;
	public String author;
	public int pages;

// Default
	public Book () {
		title = "N/A";
		genre = "N/A";
		author = "N/A";
		pages = 0;
	}

	public Book(String title, String genre, String author, int pages) {
		title = title;
		genre = genre;
		author = author;
		pages = pages;
	}

// Mutator Methods
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setGenre(String newGenre) {
		genre = newGenre;
	}
	public void setTitle(String newAuthor) {
		author = newAuthor;
	}
	public void setPages(Int newPages) {
		pages = newPages;
	}

// Accessor Method
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}	
	public String getAuthor() {
		return author;
	}	
	public int getPages() {
		return pages;
	}	
}
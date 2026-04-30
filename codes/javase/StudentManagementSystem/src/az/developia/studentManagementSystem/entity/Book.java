package az.developia.studentManagementSystem.entity;


	import java.time.LocalDateTime;

	public class Book {
	    private Integer id;
	    private String title;
	    private String author;
	    private Integer publicationYear;
	    private LocalDateTime registerDate;


	    public Book(Integer id, String title, String author, Integer publicationYear, LocalDateTime registerDate) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.publicationYear = publicationYear;
	        this.registerDate = registerDate;
	    }

	    public Integer getId() { return id; }
	    public void setId(Integer id) { this.id = id; }

	    public String getTitle() { return title; }
	    public void setTitle(String title) { this.title = title; }

	    public String getAuthor() { return author; }
	    public void setAuthor(String author) { this.author = author; }

	    public Integer getPublicationYear() { return publicationYear; }
	    public void setPublicationYear(Integer publicationYear) { this.publicationYear = publicationYear; }

	    public LocalDateTime getRegisterDate() { return registerDate; }
	    public void setRegisterDate(LocalDateTime registerDate) { this.registerDate = registerDate; }
	}

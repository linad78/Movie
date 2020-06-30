package CST438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie_rating {
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3,max=25)

	private String firstName;
	@NotNull
	@Size(min=3,max=25)
	private String movieTitle;


	//Should movieRating be an integer and not a string?
	@NotNull
	@Size(min=1,max=5)
	private String movieRating;


	//I believe you're missing the date field
	// The assignment had a date to be generated and stored when entereed
	// you sort by this date when you display all ratings
	
	public Movie_rating(){
		
	}
	
	public Movie_rating(long id, String firstName, String movieTitle, String movieRating) {
		
		super();
		this.id=id;
		this.firstName = firstName;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
	}
	public long getId() {return id;}
	public void setId(long id) {this.id=id;}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	

}

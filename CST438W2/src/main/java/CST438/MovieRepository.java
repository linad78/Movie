package CST438;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository< Movie_rating, Long> {

    // You should have a method here implemented that returns sorted movies.
    // This is one of the requirements for the assignment. His example is below:
    //    @Query("select m from MovieRating m order by title, date desc")
    //    List<MovieRating> findAllMovieRatingsOrderByTitleDateDesc();

}

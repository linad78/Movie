package CST438;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Movie {
	@Autowired
	MovieRepository movieRepository;

	@GetMapping("/movie/new")
	public String createMovie(Model model) {
		
		Movie_rating movie_rating = new Movie_rating();
		model.addAttribute("movie" , movie_rating);
		return "movie_form";
		
	}
	@PostMapping("/movie")
	public String processMovieForm(@Valid Movie_rating movie_rating,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "movie_form";
		}
	 movieRepository.save(movie_rating);	
	 model.addAttribute("movie" , movie_rating);
	 return "movie_show";
		
	}
	@GetMapping("/movie")
	public String getAllMovie(Model model) {
		Iterable<Movie_rating> title=movieRepository.findAll();
		model.addAttribute("movies", title);
		return "movie_list";
	}
	
}

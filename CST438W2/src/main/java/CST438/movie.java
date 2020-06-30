package CST438;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class movie {
	@Autowired
	movieRepository movieRepository;

	@GetMapping("/movie/new")
	public String createMovie(Model model) {
		
		movie movie = new movie();
		model.addAttribute("movie" , movie);
		return "movie_form";
		
	}
	@PostMapping("/movie")
	public String processMovieForm(@Valid movie movie,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			return "movie_form";
		}
	 movieRepository.save(movie);	
	 return "movie_show";
		
	}
	@GetMapping("/movie")
	public String getAllMovie(Model model) {
		Iterable<movie> title=movieRepository.findAll();
		model.addAttribute("movies", title);
		return "movie_list";
	}
	
}

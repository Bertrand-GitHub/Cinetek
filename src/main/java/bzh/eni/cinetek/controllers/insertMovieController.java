package bzh.eni.cinetek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class insertMovieController {

    @GetMapping({ "/insert"})
    public String Insert() {

        return "insertMovie";
    }
}

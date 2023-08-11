package bzh.eni.cinetek.bo;

import java.util.List;

public class Movie {
    private int movieId;
    private String title;
    private int releaseDate;
    private int duration;
    private String director;
    private List<Participant> actors;
    private String synopsis;

    public Movie() {
    }
    public Movie(int movieId, String title, int releaseDate, int duration, String director, List<Participant> actors, String synopsis) {
        super();
        this.movieId = movieId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
        this.synopsis = synopsis;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Participant> getActors() {
        return actors;
    }

    public void setActors(List<Participant> actors) {
        this.actors = actors;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }

}

package pl.sda.json;

import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-03-02.
 */
public class Movie {
    private String originalTitle;
    private String plTitle;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    private Director director;






    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPlTitle() {
        return plTitle;
    }

    public void setPlTitle(String plTitle) {
        this.plTitle = plTitle;
    }

}

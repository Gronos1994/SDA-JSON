import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import pl.sda.json.Movie;
import pl.sda.json.User;

import java.io.IOException;

public class JacksonTest {

    @Test
    public void test1() throws IOException {
        String jsonToDeserialize = "{\"firstName\":\"Bartosz\"," +
                "\"lastName\":\"Nowak\"," +
                "\"addressess\":{\"Home\":{\"street\":\"Al. Niepodległości\",\"city\":\"Poznań\"}}}";
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(jsonToDeserialize, User.class);

        Assert.assertEquals("Bartosz", user.getFirstName());
        Assert.assertEquals("Nowak", user.getLastName());
    }

    @Test
    public void test2() throws IOException {
        String jsonToDeserialize = "{\"originalTitle\":\"Saving Private Ryan\",\"plTitle\":\"Szeregowiec Ryan\",\"director\":{\"firstName\":\"Steven\",\"lastName\":\"Spielberg\"}}";
    ObjectMapper mapper = new ObjectMapper();
        Movie movie = mapper.readValue(jsonToDeserialize, Movie.class);

        Assert.assertEquals("Szeregowiec Ryan", movie.getPlTitle());


    }

    @Test //
    public void test3() {
        String jsonToDeserialize = "{\"originalTitle\":\"Empire Strikes Back\",\"plTitle\":\"Imperium kontratakuje\",\"director\":{\"firstName\":\"Irvin\",\"Kershner\":\"Spielberg\"}, \"boxOffice\":538375067}";

    }
}

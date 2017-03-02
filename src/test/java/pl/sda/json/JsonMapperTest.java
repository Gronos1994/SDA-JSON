package pl.sda.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by RENT on 2017-03-02.
 */
public class JsonMapperTest {
    @Test
    public void test1() throws IOException {
        String jsonToDeserialize = "{\"firstName\":\"Jan\",\"lastName\":\"Kowalski\",\"addressess\":{\"Work\":{\"street\":\"Marszałkowska\",\"code\":\"87-987\",\"city\":\"Warszawa\"},\"Home\":{\"street\":\"Baraniaka\",\"code\":\"67-122\",\"city\":\"Poznań\"}},\"childrenNames\":[\"Marek\",\"Zosia\",\"Zdzisław\"]}\n";

        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(jsonToDeserialize, User.class);

        Assert.assertEquals("Jan", user.getFirstName());
        Assert.assertNotNull(user.getChildrenNames());
        Assert.assertTrue(user.getChildrenNames().size() == 3);
        Assert.assertEquals(Arrays.asList("Marek", "Zosia", "Zdzisław"), user.getChildrenNames());

    }

    @Test
    public void test2() throws IOException {
        User user2 = new UserBuilder()
                .withFirstName("Wojtek")
                .withLastName("Zjeb")
                .withAddress("Work", new AddressBuilder().withCity("Poznań").withCode("32-543").withStreet("Baraniaka").buid())
                .withAddress("Home", new AddressBuilder().withCity("Warszawa").withCode("65-872").withStreet("Strusia").buid())
                .withChildrenName(Arrays.asList("Marek", "Zosia"))
                .build();

        ObjectMapper mapper2 = new ObjectMapper();
        String jsonMapper = mapper2.writeValueAsString(user2);

        Assert.assertEquals("Wojtek", user2.getFirstName());
        Assert.assertTrue(user2.getChildrenNames().size() == 2);
        Assert.assertTrue(jsonMapper.contains("Wojtek"));

    }

    @Test
    public void test3() throws IOException {
        User user2 = new UserBuilder()
                .withFirstName("Wojtek")
                .withLastName("Zjeb")
                .withAddress("Work", new AddressBuilder().withCity("Poznań").withCode("32-543").withStreet("Baraniaka").buid())
                .withAddress("Home", new AddressBuilder().withCity("Warszawa").withCode("65-872").withStreet("Strusia").buid())
                .withChildrenName(null)
                .build();

        ObjectMapper mapper2 = new ObjectMapper();
        String jsonMapper = mapper2.writeValueAsString(user2);
        System.out.println(jsonMapper);
    }


}

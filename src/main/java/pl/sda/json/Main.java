package pl.sda.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.*;

/**
 * Created by RENT on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        User user1 = new User();
        user1.setFirstName("Jan");
        user1.setLastName("Kowalski");
        Address address1 = new Address();
        address1.setStreet("Baraniaka");
        address1.setCode("67-122");
        address1.setCity("Poznań");

        Address address2 = new Address();
        address2.setCity("Warszawa");
        address2.setCode("87-987");
        address2.setStreet("Marszałkowska");
        Map<String, Address> adresses = new HashMap<>();
        adresses.put("Home", address1);
        adresses.put("Work", address2);
        user1.setAddressess(adresses);
        List<String> childrenNames = Arrays.asList("Marek", "Zosia" , "Zdzisław");

        user1.setChildrenNames(childrenNames);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user1);
        System.out.println(json);

    }
}

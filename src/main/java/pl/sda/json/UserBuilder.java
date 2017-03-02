package pl.sda.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserBuilder {
    private User user;

    public UserBuilder withFirstName (String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public UserBuilder withLastName (String lastName){
        user.setLastName(lastName);
        return this;
    }

    public UserBuilder withAddresses (Map<String, Address> addresses){
        user.setAddressess(addresses);
        return this;
    }
    public UserBuilder withAddress (String addressName, Address address){
        user.getAddressess().put(addressName,address);
        return this;
    }

    public UserBuilder withChildrenName (List<String> names){
        user.setChildrenNames(names);
        return this;
    }
    public User build () {
        return user;
    }

    public UserBuilder() {
        this.user =  new User();
    }
}

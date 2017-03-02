package pl.sda.json;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class User {
    private String firstName;
    private String lastName;

    private Map<String, Address> addressess = new HashMap<>();

    private List<String> childrenNames = new ArrayList<>();


    public List<String> getChildrenNames() {
        return childrenNames;
    }

    public void setChildrenNames(List<String> childrenNames) {
        this.childrenNames = childrenNames;
    }

    public Map<String, Address> getAddressess() {
        return addressess;
    }

    public void setAddressess(Map<String, Address> addressess) {
        this.addressess = addressess;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

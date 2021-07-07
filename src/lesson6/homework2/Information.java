package lesson6.homework2;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Information {

    private List<String> namesList;
    private Set<String> emailSet;
    private Map<String, String> emailNameMap;

    public Information(List<String> namesList, Set<String> emailSet, Map<String, String> emailNameMap) {
        this.namesList = namesList;
        this.emailSet = emailSet;
        this.emailNameMap = emailNameMap;
    }

    public List<String> getNamesList() {
        return namesList;
    }

    public Set<String> getEmailSet() {
        return emailSet;
    }

    public Map<String, String> getEmailNameMap() {
        return emailNameMap;
    }

    public void setNamesList(List<String> namesList) {
        this.namesList = namesList;
    }

    public void setEmailSet(Set<String> emailSet) {
        this.emailSet = emailSet;
    }

    public void setEmailNameMap(Map<String, String> emailNameMap) {
        this.emailNameMap = emailNameMap;
    }
}

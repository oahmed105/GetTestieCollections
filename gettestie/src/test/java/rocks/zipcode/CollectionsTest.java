package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

public class CollectionsTest {

    @Test
    public void hashSetTest() {
        HashSet<String> hs = new HashSet<>();
        Person person = new Person("John", 1998);
        hs.add(String.valueOf(person));
    }
}

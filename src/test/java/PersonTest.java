import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public  class PersonTest {
    @Test
    void getFullNameShouldReturnFirstNameFollowedByLastNameSeparatedBySpace() {
        Person per=new Person("Bousella","Abderrahim",22);
        Assertions.assertEquals("Bousella Abderrahim", per.getFullName());
    }

    @Test
    void isAdultShouldReturnTRueIfAgeIsGreaterThanOrEquals18(){
        Person per2=new Person("Bousella","Abderrahim",22);
        Assertions.assertEquals(true, per2.isAdult());
    }


}

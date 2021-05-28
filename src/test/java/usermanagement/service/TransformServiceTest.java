package usermanagement.service;

import org.junit.Test;
import usermanagement.entity.Person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class TransformServiceTest {
    private TransformService transformService = new TransformService();

    @Test
    public void test_to_user_domain() {
        Person person = new Person();
        person.setPersonId(1);
        person.setlName("alizade");
        person.setmName("ALI");
        person.setfName("ali");
        person.setCompanyName("company");
        User user = transformService.toUserDomain(person);
        assertEquals(user.getUserId(), Integer.valueOf(person.getPersonId()));
        assertEquals(user.getFirstName(), person.getfName());
        assertEquals(user.getLastName(), person.getlName());

    }
}

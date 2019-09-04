package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole()
    {
        Role role = RoleFactory.buildRole("manager");
        assertNotNull(role.getRoleId());
        System.out.println("The ID generated: " + role.getRoleId());
    }
}
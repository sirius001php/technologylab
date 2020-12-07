package technology_lab2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class LocationTest {
    private Location loc1, loc2;
    @Before
    public void setUp(){
        loc1 = new Location("Test", "Te", "qwe");
    }

    @Test
    public void constructorWhereLoc_CheckValidness_String(){
        assertEquals(loc1.getNameFactory(), "qwe");
        assertEquals(loc1.getCity(), "Te");
    }


    @Test
    public void getInitials_CheckWithValidData_True() {
        assertEquals(loc1.getCountry(), "Test");
    }

}
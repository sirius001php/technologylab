package technology_lab2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PassengerTest {
    private Passenger passenger;

    @Mock
    private Location loc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(loc.getFullLocation()).thenReturn("raz");
        when(loc.getNameFactory()).thenReturn("Dwa");
        passenger = new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc);
    }

    @Test
    public void changeCreationYear_ChangeCreationYearOfAnPassenger_Model(){
        passenger.setModel("Passat");
        assertEquals(passenger.getModel(), "Passat");
        verify(loc, times(2)).getFullLocation();
        verify(loc, times(2)).getNameFactory();
    }


    @Test
    public void equals_checkEquality_True() {
        Passenger temp = new Passenger("Golf", "ZFA22300005556777", BodyType.Hatchback, 2019, 1789, 4284, 5, "C", loc);
        assertEquals(passenger, temp);
    }
}
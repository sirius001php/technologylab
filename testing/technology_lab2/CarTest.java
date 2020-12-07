package technology_lab2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CarTest {
    private Car car;

    @Mock
    private Boody boody;

    @Before

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        System.out.println("sdpflsdcpsdl");
        car = new Car("Mers");
        for (int i=0; i < 5; i++) {
            car.addBody(boody);
        }
    }
    @Test
    public void getBodyCarAmount_checkArrayAmount_True() {
        assertEquals(car.getSize(), 5);
    }

    @Test
    public void addBody_addElementToArray_True() {
        car.addBody(boody);
        assertEquals(car.getSize(), 6);
    }


}
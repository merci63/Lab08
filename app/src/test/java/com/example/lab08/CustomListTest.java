package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void  testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary","AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
    public CustomList MockCityList(){
        CustomList list = new CustomList();
        return list;
    }
    @Test
    public void addCityTest(){
        CustomList list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(listSize + 1, list.getCount());
    }

}

package rocks.zipcodewilmington;


import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        //given when then
        Date date = new Date(2001, Calendar.JUNE, 8);
        Dog pup = AnimalFactory.createDog("Spot", date);
        assertTrue(pup.getName().equals("Spot")
                && pup.getBirthDate().equals(date));
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        //given when then
        Date date = new Date(2009, Calendar.MARCH, 30);
        Cat cat = AnimalFactory.createCat("Spot", date);
        assertTrue(cat.getName().equals("Spot")
                && cat.getBirthDate().equals(date));
    }
}

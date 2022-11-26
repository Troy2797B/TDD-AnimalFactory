package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    Date d1 = new Date(2020, 8, 19);

    Cat cat = new Cat("Gotti", d1, 444);
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        //given a cat
        //when setName is called
        String expected = "Demi";
        cat.setName("Demi");
        String actual = cat.getName();
        //then you get NAME
        assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given a cat
        //when it speaks
        String actual = cat.speak();
        //it says meow
        assertTrue(actual.equals("Meow"));
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //given a date
        Date date = new Date(2022, 8, 19);
        //when you set the date
        cat.setBirthDate(date);
        Date actual = cat.getBirthDate();
        //it says meow
        assertTrue(actual.equals(date));
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //given a cat
        //when it eats
        Food tuna = new Food();
        cat.eat(tuna);
        //nom nom nom
        assertTrue(cat.getNumberOfMealsEaten() > 0);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //given a cat
        //when you give it an id
        Integer expected = 444;
        Integer actual = cat.getId();
        //it changes the id
        assertEquals(actual, expected);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritenceTest(){
        //given an instance of Cat
        //when
        //it is an animal
        assertTrue(cat instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritenceTest(){
        //given an instance of Cat
        //when
        //it is a mammal
        assertTrue(cat instanceof Mammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}

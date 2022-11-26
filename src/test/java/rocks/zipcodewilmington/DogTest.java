package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Date d1 = new Date(2015, 5, 26);

    Cat dog = new Cat("Lala", d1, 333);
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given a dog
        //when it speaks
        String actual = dog.speak();
        //it barks
        assertTrue(actual.equals("Woof"));
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //given a date
        Date date = new Date(2015, 5, 24);
        //when you set the date
        dog.setBirthDate(date);
        Date actual = dog.getBirthDate();
        //it has a birthdate
        assertTrue(actual.equals(date));
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //given a pupper
        //when it eats
        Food liver = new Food();
        dog.eat(liver);
        //nom nom nom
        assertTrue(dog.getNumberOfMealsEaten() > 0);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //given a dog
        //when you give it an id
        Integer expected = 333;
        Integer actual = dog.getId();
        //it changes the id
        assertEquals(actual, expected);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritenceTest(){
        //given an instance of dawg
        //when
        //it is an animal
        assertTrue(dog instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritenceTest(){
        //given an instance of DOG
        //when
        //it is a mammal
        assertTrue(dog instanceof Mammal);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}

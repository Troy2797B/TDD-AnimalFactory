package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    Date d1 = new Date(2015, 1, 26);
    Dog lala = new Dog("Lala", d1, 222);
    Date d3 = new Date(2019, 6, 15);
    Dog deedee = new Dog("Demi", d3, 111);
    @BeforeClass
    public static void setupBeforeClass() {

    }
    @Test
    public void addTest() {
        DogHouse.add(deedee);
        DogHouse.add(lala);
        Assert.assertEquals(2, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeByIdTest() {
        DogHouse.add(lala);
        DogHouse.removeById(lala.getId());
        TestCase.assertEquals(0, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeTest() {
        DogHouse.add(lala);
        DogHouse.remove(deedee);
        TestCase.assertEquals(1, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void getDogByIdTest() {
        DogHouse.add(lala);
        assertEquals(DogHouse.getDogById(222), lala);
    }

    @Test
    public void getNumberOfDogsTest() {
        TestCase.assertEquals(0, (int) DogHouse.getNumberOfDogs());
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}

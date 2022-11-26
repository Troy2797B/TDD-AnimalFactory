package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    Date d1 = new Date(2020, 8, 19);
    Cat gotti = new Cat("Gotti", d1, 333);
    Date d3 = new Date(2020, 9, 7);
    Cat demi = new Cat("Demi", d3, 444);

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        //given a cat house
        //when you add it to the list
        CatHouse.add(demi);
        CatHouse.add(gotti);
        //the cat should be able to be removed from the list
        Assert.assertEquals(2, (int) CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {
        //given a cat and its id
        //when you remove the cat by id
        CatHouse.removeById(gotti.getId());
        //the list shouldnt have that cat?
//        assertTrue(CatHouse.getNumberOfCats() == 1);
        TestCase.assertEquals(0, (int) CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeTest() {
        CatHouse.add(gotti);
        CatHouse.remove(demi);
        TestCase.assertEquals(1, (int) CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        CatHouse.add(gotti);
        assertEquals(CatHouse.getCatById(333), gotti);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        TestCase.assertEquals(0, (int) CatHouse.getNumberOfCats());
    }
}

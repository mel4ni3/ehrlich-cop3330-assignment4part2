/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GUITest {

        // test if new lists are able to be created
        @Test
        void newListTest() {
            // create a new List object
            // call isValidList with the new list and assertTrue its return value
        }

        // test if lists are able to be deleted
        @Test
        void delListTest() {
            // call delList with a random list from the Total arraylist using rand
            // assertFalse the return value of isValidList with the random list
        }

        // test if lists can be saved
        @Test
        void saveListsTest() {
            // create a new list and call saveLists
            // assertTrue that the list returned from saveLists is not empty
        }

        // test if lists can be loaded
        @Test
        void loadListsTest() {
            // create a new list, call saveLists, call loadLists
            // assertTrue that the return list from loadLists is not empty
        }

        // test if the last list was saved to storage
        @Test
        void saveLastListTest() {
            // create a new arraylist of ToDos and call saveLastList
            // assertTrue that the return list is not empty
        }

        // test if the last list can be loaded to storage
        @Test
        void loadLastListTest() {
            // create a new arraylist of ToDos and call saveLastList with it
            // call loadLastList and assertTrue that the return list is not empty
        }


}

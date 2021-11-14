/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GUITest {

        // test if new tasks are able to be added and removed from a list
        @Test
        void addRemoveTest() {

                // create a new List object
                List list = new List();

                // create an arraylist for comparison
                ArrayList<ToDos> tasks = new ArrayList<>();

                // create tasks to be added
                ToDos task1 = new ToDos("task1", "2021-11-03");
                ToDos task2 = new ToDos("task2", "2021-11-25");

                // add tasks to the list using the method to be tested
                list.addTask(task1);
                list.addTask(task2);

                // add tasks to the arraylist
                tasks.add(task1);
                tasks.add(task2);

                // test deletion by deleting tasks from both
                list.deleteTask(task2);
                tasks.remove(task2);

                // see if the two are equal
                assertEquals(list.tasks, tasks);
        }


        // test if lists can be saved and loaded
        @Test
        void saveLoadTest() {
            // create a new list that will be saved
            List savedList = new List();

            // add tasks to it
            ToDos task1 = new ToDos("task1", "2021-11-03");
            ToDos task2 = new ToDos("task2", "2021-11-25");

            savedList.addTask(task1);
            savedList.addTask(task2);

            // create a new file directory for list tests
            new File("./listTests").mkdirs();

            // create a new file to save the list to
            String name = "test";
            File file = new File("./listTests/"+name+".csv");

            // save the list
            savedList.saveList(file);

            // load the list from the file to a new list
            List loadedList;
            loadedList = savedList.loadList(file);

            // see if the loaded list has content
                assertFalse(loadedList.tasks.isEmpty());

        }

        // test if lists can be cleared
        @Test
        void clearListTest() {
                // create a new list
                List list = new List();

                // add tasks to it
                ToDos task1 = new ToDos("task1", "2021-11-03");
                ToDos task2 = new ToDos("task2", "2021-11-25");

                list.addTask(task1);
                list.addTask(task2);

                // clear the list
                list.clear();

                // see if it is empty
                assertTrue(list.tasks.isEmpty());

        }

        // test if task attributes can be edited
        @Test
        void editTaskTest() {
                // create a new list
                List list = new List();

                // add tasks to it, create two tasks with the same attributes for comparison
                ToDos task1 = new ToDos("task", "2021-11-25");
                ToDos task2 = new ToDos("task", "2021-11-25");

                list.addTask(task1);
                list.addTask(task2);

                // edit the attributes of the second task
                task2.editDesc("description should be different");
                task2.editdueDate("2021-11-26");
                task2.editisComplete();

                // see if the two tasks have equal attributes
                assertTrue(task1.getdueDate() != task2.getdueDate() && task1.getDesc() != task2.getDesc() && task1.getisComplete() != task2.getisComplete());

        }

        // test if all tasks can be retrieved, all of them or based on completion
        @Test
        void getTasksTest() {
                // create a new list
                List list = new List();

                // add tasks to it
                ToDos task1 = new ToDos("task1", "2021-11-03");
                ToDos task2 = new ToDos("task2", "2021-11-25");

                list.addTask(task1);
                list.addTask(task2);

                // edit the completion of one of the tasks
                task2.editisComplete();

                // make sure that none of the following arraylists are equal:
                // all tasks, complete tasks, and incomplete tasks
                assertTrue(list.getTasks() != list.getComplete() && list.getTasks() != list.getIncomplete() && list.getComplete()!= list.getIncomplete());
        }


}

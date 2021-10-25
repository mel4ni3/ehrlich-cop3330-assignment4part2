/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.util.ArrayList;

public class HelloController {

    // create an arraylist of lists called ToDoLists

    public void displayTasks(ArrayList<ToDos> tasks, List list){
        // display tasks on screen within the specific list
    }

    public void displayNextList(ActionEvent event) {
        // display the list received from calling loadLastList from Total
    }

    public void displayLists(ArrayList<List> lists){
        // sort lists using the sortLists method in Total
        // display the returned lists on screen
    }

    public void displayAllLists(ActionEvent event) {
        // call loadLists from Total and store the return value in an arraylist of lists
        // display the arraylist
    }

    public void displayAllTasks(ActionEvent event) {
        // get the title of the list from the textfield and call getTasks method in List
        // call displayTasks with the return value from getIncomplete
    }

    public void displayCompleteTasks(ActionEvent event) {
        // get the title of the list from the textfield and call getComplete method in List
        // call displayTasks with the return value from getIncomplete
    }

    public void displayIncompleteTasks(ActionEvent event) {
        // get the title of the list from the textfield and call getIncomplete method in List
        // call displayTasks with the return value from getIncomplete
    }

    public void saveNextList(ActionEvent event) {
        // when a list is clicked, store it in a variable list
        // if the list is already in the ToDoLists arraylist (use isValidList from Total) save it with saveLastList in Total
        // otherwise add it with newList in Total and then save it with saveLastList in Total
    }

    public void saveAllLists(ActionEvent event) {
        // call saveLists in Total when the button is clicked
    }

    public void saveNextTask(ActionEvent event) {
        // get the list of the item clicked and called isValidList using it, if it is false, add it to the ToDoLists arraylist, else continue
        // get the desc and dueDate fields of the task and create a new ToDos object using them in the constructor
        // add the task to the list using newList() in List
    }

    public void editTaskDesc(ActionEvent event) {
        // get the list and ToDos objects of the task clicked
        // call editDesc method in ToDos with the string in the textfield
    }

    public void editTaskDate(ActionEvent event) {
        // get the list and ToDos objects of the task clicked
        // call editDate method in ToDos with the date in the textfield
    }

    public void editTaskPos(ActionEvent event) {
        // get the list of the item clicked and called isValidList using it, if it is false, add it to the ToDoLists arraylist, else continue
        // create a Boolean called completed
        // if the isComplete Boolean field is true, set completed to false, else set it to true
        // call the item's editPos method in ToDos with completed
    }

    public void deleteNextTask(ActionEvent event) {
        // get the list of the item clicked and called isValidList using it, if it is false, add it to the ToDoLists arraylist, else continue
        // call the deleteTask method in List to remove the task
    }

    public void editNextList(ActionEvent event) {
        // get the list of the item clicked and called isValidList using it, if it is false, add it to the ToDoLists arraylist, else continue
        // call the editName method in List on the list
    }

    public void deleteNextList(ActionEvent event) {
        // get the list of the item clicked and called isValidList using it, if it is false, add it to the ToDoLists arraylist, else continue
        // find the list in ToDoLists and call the delList method in Total with it
    }

}
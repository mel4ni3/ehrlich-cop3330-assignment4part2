/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

public class List {

    // fields:
    //String name for title of the to do list
    //Private ArrayList<ToDos> tasks containing all tasks (ToDos items) within the to do list

    // constructor for creating a new list
    public List(String str){
        // set the list's name to str
    }

    // method for editing name of list
    public void editName(String str){
        // set's the list's name to str
    }

    // method for adding task to list
    public void addTask(ToDos task){
        // add task to the arraylist of tasks contained in this list
    }

    // method for deleting task from list
    public void deleteTask(ToDos task){
        // searches for task in the arraylist
        // removes task from the arraylist
    }

    // getter for incomplete items
    //public ArrayList<ToDos> getIncomplete(List toDoList){
        // create a new arraylist of ToDos object called incompletes
        // loop through toDoList tasks field and if the ToDos object has a complete value of false, add it to incompletes
        //return incompletes
    //}

    // getter for complete items
    //public ArrayList<ToDos> getComplete(List toDoList){
        // create a new arraylist of ToDos object called completes
        // loop through toDoList tasks field and if the ToDos object has a complete value of true, add it to completes
        // return completes
    //}

    // getter for name of list
    //public String getName(){
        // return the name of the list
    //}

    // getter for tasks in list
    //public ArrayList<ToDos> getTasks(List toDoList){
        // return the tasks field of the List object
    //}

}

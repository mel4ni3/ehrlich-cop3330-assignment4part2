package ucf.assignments;

import java.util.ArrayList;

public class Total {

    // fields:
    // Public arraylist of lists ToDoLists for all the to do lists
    // Private ToDos Save for the last saved to do list

    public void newList(List list){
        // create a new List object and add it to the ToDoLists field
    }

    public void delList(List list){
        // use a loop to find list in the ToDoLists field of the Total object
        // remove list from the ToDoLists arraylist
    }

    //public Boolean isValidList(List list){
    // loop through the ToDoLists field to find list
    // return true if the list is found and false otherwise
    //}

    //public ArrayList<List> sortLists(ArrayList<List> toDoLists){
    // create an arraylist of lists called sorted
    // sort toDoLists by date
    // copy toDoLists into sorted and return sorted
    //}

    public void saveLists(){
        // save the lists in ToDoLists to external storage
        // update the Save field to the latest saved list
    }

    public void saveLastList(List list){
        // find list in the ToDoLists field, save it, and update the Save field
    }

    //public ArrayList<List> loadLists(){
        // load all lists in external storage to an arraylist of lists
        // return the arraylist
    //}

    //public List loadLastList(){
        // load the list from the Save field
        // return the list in the Save field
    //}

}

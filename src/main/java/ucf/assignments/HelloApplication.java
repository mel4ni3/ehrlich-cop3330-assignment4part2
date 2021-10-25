/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class Total {

        // fields:
        // Public ArrayList<List> ToDoLists containing all the to do lists
        // Private ToDoList Save containing the saved to do list

        // method for adding a new to do list
        public void newList(List list){
            // create new to do list and add it to the ToDoLists arraylist
        }

        // method for removing a to do list
        public void delList(List list){
            // loop through ToDoLists and remove list from the arraylist
        }

        // method for updating the Save field and saving lists
        public void saveLists(){
            // save all to do lists to external storage
            // set the Save field to the latest saved to do list
        }

        // method for loading all previously saved to do lists
        //public ArrayList<List> loadLists(){
            // create a new arraylist of saved lists, put all saved lists on external storage into the arraylist and return it
       // }

        // method for saving the latest to do list
        public void saveLastList(List list){
            // find list in the ToDoLists field, save it and set Save field to list
        }

        // method for loading the latest save list
        //public List loadLastList(){
            // load the list from the Save field from external storage, and return the list in the Save field
        //}

        // method for seeing if a to do list exists
        //public Boolean isValidList(List list){
            // loops through ToDoLists field to see if list can be found
            // return true if it is found and false otherwise
        //}

        // method for sorting to do lists by date
        //public ArrayList<List> sortLists(ArrayList<List> toDoLists){
            // create new arraylist of List objects called toDosSorted
            // sort toDoList based on the date field of each task in the list
            // copy tDoList into toDosSorted and return toDosSorted
        //}
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleBooleanProperty;


public class ToDos {

    // fields:
    SimpleStringProperty desc; //containing task description
    SimpleStringProperty dueDate; //containing task due date
    SimpleBooleanProperty isComplete; //true if the task is complete and false otherwise

    // constructor for creating a new task
    public ToDos(String desc, String dueDate){
        this.desc = new SimpleStringProperty(desc);
        this.dueDate = new SimpleStringProperty(dueDate);
        this.isComplete = new SimpleBooleanProperty(false); // false until the editPos button is clicked
    }

    // getter for task description
    public String getDesc(){
        return desc.get();
    }

    // getter for task due date
    public String getdueDate(){
        return dueDate.get();
    }

    // getter for task completion
    public Boolean getisComplete() {
        return isComplete.get();
   }

    // method for editing the task description
    public void editDesc(String str) {
        this.desc = new SimpleStringProperty(str);
    }

    // method for editing the task date
    public void editdueDate(String date){
        this.dueDate = new SimpleStringProperty(date);
    }

    // method for editing if the task is completed
    public void editisComplete(){
        if (isComplete.get())
            this.isComplete = new SimpleBooleanProperty(false);
        else
            this.isComplete = new SimpleBooleanProperty(true);
    }

}

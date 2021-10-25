/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import java.util.Date;

public class ToDos {

    // fields:
    // Private String desc containing task description
    // Private String dueDate containing task due date
    // Private Boolean isComplete which is true if the task is complete and false otherwise

    // constructor for creating a new task
    public ToDos(String desc, String dueDate){
        // assigns the task's desc and dueDate fields to the appropriate parameters
    }

    // getter for task description
    //public String getDesc(){
        //return the description field of the ToDos object
    //}

    // getter for task position
    //public Boolean getPos() {
        // returns the isComplete field of the ToDos object
   //}

    // method for editing the task description
    public void editDesc(String str){
        // changes the ToDos object's description field to str
    }

    // method for editing the task date
    public void editDate(String date){
        // changes the ToDos object's dueDate field to date
    }

    // method for editing if the task is completed
    public void editPos(Boolean completed){
        // changes the ToDos object's isComplete value to completed
    }

    // method for formatting Date object
    //private Date formatDate(){
        // create new date object, formats string from date object and returns the date object
    //}

    // method for returning Date object
    //public Date getDate(){
        // returns the Date object from formatDate()
    //}
}

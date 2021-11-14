/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;

import java.io.*;
import java.util.ArrayList;

public class List {

    // fields:
    ArrayList<ToDos> tasks; //containing all tasks (ToDos items) within the to do list

    // constructor for creating a new list
    public List(){
        // initialize arraylist of tasks
        tasks = new ArrayList<>();
    }

    // method for adding task to list
    public void addTask(ToDos task){
        tasks.add(task);
    }

    // method for deleting task from list
    public void deleteTask(ToDos task){
        tasks.remove(task);
    }

    // method for removing all tasks from list
    public void clear(){
        tasks.clear();
    }

    // getter for incomplete items
    public ArrayList<ToDos> getIncomplete(){
        // create a new arraylist of ToDos object called incompletes
        ArrayList<ToDos> incompletes = new ArrayList<>();

        // loop through toDoList tasks field and if the ToDos object has a complete value of false, add it to incompletes
        for(ToDos i: tasks){
            if (!(i.isComplete.get()))
                incompletes.add(i);
        }
        // return the array of incomplete tasks
        return incompletes;
    }

    // getter for complete items
    public ArrayList<ToDos> getComplete(){
        // create a new arraylist of ToDos object called completes
        ArrayList<ToDos> completes = new ArrayList<>();

        // loop through toDoList tasks field and if the ToDos object has a complete value of true, add it to completes
        for(ToDos i: tasks){
            if (i.isComplete.get())
                completes.add(i);
        }
        // return the array of complete tasks
        return completes;
    }

    // getter for tasks in list
    public ArrayList<ToDos> getTasks(){
        return tasks;
    }

    // method for saving the list to a csv file in external storage
    public void saveList(File fileDirectory){

        try {
            // create a bufferedwriter to write to the specified file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileDirectory));

            // the first line of the file will contain the name of each field
            writer.write("Description");
            writer.write(",");
            writer.write("Due Date");
            writer.write(",");
            writer.write("Completion");
            writer.write("\n");

            // write all the attributes of each task and separate with commas
            for (ToDos task: tasks) {

                writer.write(task.getDesc());
                writer.write(",");

                writer.write(task.getdueDate());
                writer.write(",");

                // write specific values based on completion
                if(task.isComplete.get()){
                    writer.write("complete\n");
                }else{
                    writer.write("incomplete\n");
                }
            }

            // close the bufferedwriter
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // method for loading a list to the app from a csv file
    public List loadList(File fileDirectory){

        // create a new list that will contain the contents from the file
        List newlist = new List();
        // the arraylist to be loaded and displayed on screen
        ArrayList<ToDos> newtasks = new ArrayList<>();
        newlist.tasks = newtasks;

        try {
            // create a bufferedreader to read from the specified file
            BufferedReader reader = new BufferedReader(new FileReader(fileDirectory));

            String line = "";
            line = reader.readLine();
            while((line = reader.readLine()) != null){
                // string containing all following text in the file
                String[] str = line.split(","); // separate values

                // set the fields for each task with values from the file

                ToDos task = new ToDos(str[0], str[1]);

                // set specific values based on the completion of the task
                if(str[2].equals("complete")){
                    task.isComplete = new SimpleBooleanProperty(true);
                }else{
                    task.isComplete = new SimpleBooleanProperty(false);
                }

                // add task into arraylist
                newtasks.add(task);
            }

            // set task field for this list
            tasks = newtasks;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // return the newly created list with the values from the file
        return newlist;
    }

}

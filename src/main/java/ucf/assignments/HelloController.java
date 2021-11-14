/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ucf.assignments;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Callback;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    // create an arraylist of lists called ToDoLists
    List list = new List();

    // create an observable list that can be displayed in the tableview
    static ObservableList<ToDos> display = FXCollections.observableArrayList();

    // elements from the fxml file

    @FXML
    private Button addItemButton;

    @FXML
    private Button allButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button completeButton;

    @FXML
    private DatePicker dateField;

    @FXML
    private Button delItemButton;

    @FXML
    private TableView<ToDos> listTable;

    @FXML
    private TableColumn<ToDos, String> desc;

    @FXML
    private TableColumn<ToDos, String> dueDate;

    @FXML
    private TableColumn<ToDos, Boolean> isComplete;

    @FXML
    private TextField descField;

    @FXML
    private Button editDateButton;

    @FXML
    private Button editDescButton;

    @FXML
    private Button editPosButton;

    @FXML
    private Button incompleteButton;

    @FXML
    private Button loadButton;

    @FXML
    private Button saveButton;

    @FXML
    private TextField fileField;

    // functions that are triggered when said elements are clicked, as specified in the fxml file

    @FXML
    // triggered when the add item button is clicked
    void addAction(ActionEvent event) {
        // create a new task with the properties in the two text fields
        ToDos task = new ToDos(descField.getText(), dateField.getValue().toString());

        // add it to the list in the backend and the table
        list.addTask(task);
        listTable.getItems().add(task);

        // refresh table
        listTable.refresh();

        // clear text fields
        descField.setText("");
        dateField.setValue(null);
    }

    @FXML
    // triggered when the clear list button is clicked
    void clearAction(ActionEvent event) {
        // clears the backend list and the table
        list.clear();
        listTable.getItems().clear();
        listTable.refresh();
    }

    @FXML
    // displays all task in the list when the display all button is clicked
    void displayAll(ActionEvent event) {
        // calls the getTasks method of the list
        // converts the returned list to an observable list
        display = FXCollections.observableArrayList(list.getTasks());
        listTable.setItems(display); // displays the observable list
        listTable.refresh(); // refreshes to show updates immediately
    }

    @FXML
    // when the complete button is clicked, displays only the complete tasks in the list
    void displayComplete(ActionEvent event) {
        // calls the getComplete method of the list
        // converts the returned list to an observable list
        display = FXCollections.observableArrayList(list.getComplete());
        listTable.setItems(display); // displays the observable list
        listTable.refresh(); // refreshes to show updates immediately
    }

    @FXML
    // when the incomplete button is clicked, displays only the complete tasks in the list
    void displayIncomplete(ActionEvent event) {
        // calls the getComplete method of the list
        // converts the returned list to an observable list
        display = FXCollections.observableArrayList(list.getIncomplete());
        listTable.setItems(display); // displays the observable list
        listTable.refresh(); // refreshes to show updates immediately
    }

    @FXML
    // triggered when edit date button is clicked
    void editTaskDate(ActionEvent event) {
        // get the task that the user wants to edit
        ToDos current = listTable.getSelectionModel().getSelectedItem();
        // change the date to what is in the date field
        String str = dateField.getValue().toString();
        current.editdueDate(str);
        listTable.refresh();
    }

    @FXML
    // triggered when thr edit description button is clicked
    void editTaskDesc(ActionEvent event) {
        // get the task that the user wants to edit
        ToDos current = listTable.getSelectionModel().getSelectedItem();
        // change the description to what is in the description field
        String str = descField.getText();
        current.editDesc(str);
        listTable.refresh();

    }

    @FXML
    // triggered when the edit completion button is clicked
    void editTaskPos(ActionEvent event) {
        // get the task that the user wants to edit
        ToDos current = listTable.getSelectionModel().getSelectedItem();
        current.editisComplete(); // edit the task completion
        listTable.refresh(); // show updates immediately
    }

    @FXML
    // triggered when the load list button is clicked
    void loadAction(ActionEvent event) {
        // get the file name that the user wants to load from
        String name = fileField.getText();
        File file = new File("./lists/"+name+".csv");

        // display the list loaded from the file
        display = FXCollections.observableArrayList(list.loadList(file).tasks);
        listTable.setItems(display);
        listTable.refresh();

        // clear the textfield
        fileField.setText("");

    }

    @FXML
    // triggered when the remove item button is clicked
    void removeAction(ActionEvent event) {
        // get the task that the user wants to delete
        ToDos task = listTable.getSelectionModel().getSelectedItem();

        // remove it from the list in the backend and the table
        list.deleteTask(task);
        listTable.getItems().remove(task);

        // refresh table
        listTable.refresh();
    }

    @FXML
    // triggered when the save list button is clicked
    void saveAction(ActionEvent event) {

        // get the name that the user wants to name the file
        String name = fileField.getText();
        File file = new File("./lists/"+name+".csv");

        list.saveList(file);

        // clear the textfield
        fileField.setText("");

    }

    @Override
    // occurs when the program is launched
    public void initialize(URL location, ResourceBundle resources) {
        //sets cell value factory to Item's values respectively
        desc.setCellValueFactory(new PropertyValueFactory<>("desc"));

        dueDate.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ToDos, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ToDos, String> p) {
                // p.getValue() returns the ToDos instance for a particular TableView row
                return p.getValue().dueDate;
            }
        });

        isComplete.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ToDos, Boolean>, ObservableValue<Boolean>>() {
            public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<ToDos, Boolean> p) {
                // p.getValue() returns the ToDos instance for a particular TableView row
                return p.getValue().isComplete;
            }
        });

        // makes it unable for users to select a date before the current date
        dateField.setDayCellFactory(picker -> new DateCell() {
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                LocalDate today = LocalDate.now();
                setDisable(empty || date.compareTo(today) < 0 );
            }
        });

        // display observable list in table
        listTable.setItems(display);

        // make directory for user to save lists
        new File("./lists").mkdirs();
    }

}
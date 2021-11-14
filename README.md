# ehrlich-cop3330-assignment4part2

## Welcome! This is a to-do list manager. You can run it by running the `HelloApplication.java` file. To do lists are displayed in the table.

### Add an item to the list
Fill out the description text field, choose a date by clicking the icon to the right of the date field, and click the `Add Item` button! Your task will appear in the table. The completed column will be false until it is set otherwise.

### Remove an item from the list
Click on the row of the table containing the task you want to delete, then click the `Remove Item` button. That row of the table will disappear, and the item will have been removed.

### Edit an item's description
Write a new description for the item in the description text field, then select the item by clicking its row in the table, then press `Edit Item Description`. The table will refresh to show its new description.

### Edit an item's date
Choose a new date for the item with the datepicker, select the item's row in the table, then press  `Edit Item Date`. The table will refresh to show its new due date. *Note: you cannot select dates before the current date.*

### Edit an item's completion
Select the item's row in the table, then press `Edit Item Completion`. The table will refresh, and the completion will become the opposite of what it was before - true or false.

### Display items
Press `Display All`, `Display Complete`, or `Display Incomplete` to display items in the table based on completion - either all items, only those that are complete, or only those that are incomplete.

### Save a list externally
Enter a file name *(without the extension)* in the file field, then press `Save List`. You will find a csv file with the name you entered and any items in the table in a `lists` folder in the root directory of the program.

### Load a list from external file (csv files)
Enter a file name *(without the extension)* in the file field, then press `Load List`. **Note: the file must be in the lists folder in the directory of the program. This folder is automatically created when the program is launched.** Contents from the file will then be displayed in the table.
This works best with files created through this program.

### Clear list
Press the `Clear List` button, and all items in the table will be removed.

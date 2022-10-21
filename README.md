# PTBS

Steps to compile:
1. Clone repository from 
2. Open the project in Intellij.
3. Click on Run from the 
4. The output will be displayed in the terminal.


# Design Patterns

- Five design pattern were implemented in this PTBS Project.

1. Facade Pattern: This is the face of the PTBS where this has access to all subsystems. The facade object contains all 
the components of the subsystem. In this PTBS it has the implementation of login code where it validates the user.

2. Bridge Pattern: This pattern takes care of menu options, after a user logged in successfully. Based on the input of
the user(buyer or seller) implemented from person, the productMenu interface will be implemented by the MeatProductMenu 
or ProduceProductMenu.

3. Factory Pattern: In this pattern, based on the product category and user type it will display the menu of the selected
product. It will decide the instantiation class based on input from the user.

4. Iterator Pattern: This pattern iterates the product elements and implements them with the abstract methods of the 
iterator.

5. Visitor Pattern: In this Pattern ReminderVisitor inherits Node Visitor where visitTrading is called by the 
ReminderVisitor object once the user selects the visitTrading option.

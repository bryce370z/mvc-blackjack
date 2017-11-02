<!-- slide -->
## Model View Controller (MVC)
Intention of MVC architecture:

<small>

  - separations of the user display from
  the control of user input and the underlying information model.

  - very useful because of:

    - reusability of application

    - ability to develop the application and user interface separately

    - ability to define control style classes which provide common
    features separately from how these features may be displayed.

</small>

<!-- slide -->
## MVC with Java

<small>

- Observer/observable model. This allows application programs and user intefaces to be loosely coupled

- Delegation event model. This provides listeners which act as controllers handling various events that may occur.

- Java delegation: listeners are objects that "listen" for particular event to occur.
 - e.g: button has been pressed


 ```Java
 exitButtonController = new exitButtonController();
 exitButton = new Button(" Exit ");
 exitButton.addActionListener(exitButtonController);
 ```

 ```Java
 class  exitButtonController implements ActionListener {
   public void actionPerformed(ActionEvent event) {
     System.exit(0);
   }
 }
 ```

</small>


<!-- slide -->
## MVC entities
<img src="images/mvc.png" alt="Drawing" style="width: 600px;"/>


<!-- slide -->
## MVC Notifications
<img src="images/mvc-framework.png" alt="Drawing" style="width: 650px;"/>


<!-- slide -->
## Example: Calculator
<img src="images/Calculator.png" alt="Drawing" style="width: 650px;"/>

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


public class ControllerCal {
    //declare the buttons
    @FXML
    private Button buttonZero;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonTwo;
    @FXML
    private Button buttonThree;
    @FXML
    private Button buttonFour;
    @FXML
    private Button buttonFive;
    @FXML
    private Button buttonSix;
    @FXML
    private Button buttonSeven;
    @FXML
    private Button buttonEight;
    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonEquals;
    @FXML
    private Button buttonClear;

    @FXML
    private TextField textField;

    public String calcVal = "0";

    //Method called when MainCal is run
    //each buttons action event calls buttonHandling and passes a specific int
    public void initialize(){
        textField.setText(calcVal);

        buttonZero.setOnAction(event -> buttonHandling(10));
        buttonOne.setOnAction(event -> buttonHandling(1));
        buttonTwo.setOnAction(event -> buttonHandling(2));
        buttonThree.setOnAction(event -> buttonHandling(3));
        buttonFour.setOnAction(event -> buttonHandling(4));
        buttonFive.setOnAction(event -> buttonHandling(5));
        buttonSix.setOnAction(event -> buttonHandling(6));
        buttonSeven.setOnAction(event -> buttonHandling(7));
        buttonEight.setOnAction(event -> buttonHandling(8));
        buttonNine.setOnAction(event -> buttonHandling(9));

        buttonPlus.setOnAction(event -> buttonHandling(11));
        buttonMinus.setOnAction(event -> buttonHandling(12));
        buttonMultiply.setOnAction(event -> buttonHandling(13));
        buttonDivide.setOnAction(event -> buttonHandling(14));


        buttonClear.setOnAction(event -> clearScreen());

        buttonEquals.setOnAction(event -> getResult());
    }
    //Method to handle the button inputs.
    //each button action passes in an int
    public void buttonHandling(int i){
        String newVal = "";
        if (i == 1)
            newVal = "1";
        else if (i == 2)
            newVal = "2";
        else if (i == 3)
            newVal = "3";
        else if (i == 4)
            newVal = "4";
        else if (i == 5)
            newVal = "5";
        else if (i == 6)
            newVal = "6";
        else if (i == 7)
            newVal = "7";
        else if (i == 8)
            newVal = "8";
        else if (i == 9)
            newVal = "9";
        else if (i == 10)
            newVal = "0";
        else if (i == 11)//plus
            newVal = "+";
        else if (i == 12)//minus
            newVal = "-";
        else if (i == 13)//Multiply
            newVal = "*";
        else if (i == 14)//Divide
            newVal = "/";

        //check if prior input and add to the end
        //if none replace "0" with input
        if (calcVal == "0")
            calcVal = newVal;
        else
            calcVal = calcVal.concat(newVal);
        //set the textfield to the inputted value
        textField.setText(calcVal);
    }
    //set the value on the screen to "0"
    public void clearScreen(){
        calcVal = "0";
        textField.setText("0");
    }

    public void getResult(){
        Object result;
        //declare a script engine manager for evaluating the inputted expression
        ScriptEngineManager mgr = new ScriptEngineManager();
        //declare a JavaScript engine
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            //evaluate the inputted calculator expression using the JavaScript engine
            result = engine.eval(calcVal);
            //convert result to a string
            calcVal = String.valueOf(result);
            //set the textFiled to the result
            textField.setText(String.valueOf(result));
        }
        catch (Exception e){
            //return error if script could not be evaluated
            textField.setText("Syntax Error");
        }
    }

}



package sample;

import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import java.awt.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.lang.Throwable;
import javax.script.ScriptException;



public class ControllerCal {

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

    public void initialize(){
        textField.setText(calcVal);

        buttonZero.setOnAction(event -> buttonHandeling(10));
        buttonOne.setOnAction(event -> buttonHandeling(1));
        buttonTwo.setOnAction(event -> buttonHandeling(2));
        buttonThree.setOnAction(event -> buttonHandeling(3));
        buttonFour.setOnAction(event -> buttonHandeling(4));
        buttonFive.setOnAction(event -> buttonHandeling(5));
        buttonSix.setOnAction(event -> buttonHandeling(6));
        buttonSeven.setOnAction(event -> buttonHandeling(7));
        buttonEight.setOnAction(event -> buttonHandeling(8));
        buttonNine.setOnAction(event -> buttonHandeling(9));

        buttonPlus.setOnAction(event -> buttonHandeling(11));
        buttonMinus.setOnAction(event -> buttonHandeling(12));
        buttonMultiply.setOnAction(event -> buttonHandeling(13));
        buttonDivide.setOnAction(event -> buttonHandeling(14));


        buttonClear.setOnAction(event -> clearScreen());

        buttonEquals.setOnAction(event -> getResult());
    }

    public void buttonHandeling(int i){
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


        if (calcVal == "0")
            calcVal = newVal;
        else
            calcVal = calcVal.concat(newVal);

        textField.setText(calcVal);
    }

    public void clearScreen(){
        calcVal = "0";
        textField.setText("0");
    }

    public void getResult(){
        Object result;
        System.out.println("getResult");
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            System.out.println("try");
            result = engine.eval(calcVal);
            System.out.println(calcVal + "=" + result);
            textField.setText(String.valueOf(result));
        }
        catch (Exception e){
            System.out.println("Error ");
            textField.setText("Syntax Error");
            }
        //System.out.println(calcVal + "=" + result);
    }

}



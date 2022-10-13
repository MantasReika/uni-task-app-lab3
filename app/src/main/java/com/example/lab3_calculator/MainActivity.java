package com.example.lab3_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static java.lang.Double.parseDouble;
import static java.lang.Math.sqrt;
import org.mariuszgromada.math.mxparser.Expression;



public class MainActivity extends AppCompatActivity {

    TextView calculatorScreen;

    String calculationEquation = "";
    boolean isSqrRootPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calculatorScreen = findViewById(R.id.calculatorScreen);
    }

    public void setCalculationEquation(String givenValue){

        calculationEquation = calculationEquation + givenValue;
        calculatorScreen.setText(calculationEquation);
    }

    public static double calculateEquation(String calc) {
        Expression e = new Expression(calc);
        return e.calculate();
    }

    public void equalsOnClick(View view) {
        double answer = 0;

        if(isSqrRootPressed == true) {
            calculationEquation = calculationEquation.substring(1);
            answer = sqrt(parseDouble(calculationEquation));
            calculationEquation = String.valueOf(answer);
        }
        else {
            answer = calculateEquation(calculationEquation);
        }
        calculatorScreen.setText(String.valueOf(answer));
    }


    public void oneOnClick (View view){
        setCalculationEquation("1");
    }

    public void twoOnClick (View view){
        setCalculationEquation("2");
    }

    public void threeOnClick (View view){
        setCalculationEquation("3");
    }

    public void fourOnClick (View view){
        setCalculationEquation("4");
    }

    public void fiveOnClick (View view){
        setCalculationEquation("5");
    }

    public void sixOnClick (View view){
        setCalculationEquation("6");
    }

    public void sevenOnClick (View view){
        setCalculationEquation("7");
    }

    public void eightOnClick (View view){
        setCalculationEquation("8");
    }

    public void nineOnClick (View view){
        setCalculationEquation("9");
    }

    public void zeroOnClick (View view){
        setCalculationEquation("0");
    }

    public void divisionOnClick (View view){
        setCalculationEquation("/");
    }

    public void multiplyOnClick (View view){
        setCalculationEquation("*");
    }

    public void minusOnClick (View view){
        setCalculationEquation("-");
    }

    public void plusOnClick (View view){
        setCalculationEquation("+");
    }

    public void rootOnClick(View view) {
        isSqrRootPressed = true;
        setCalculationEquation("\u221A");
    }

    public void delOnClick(View view) {
        calculationEquation = "";
        setCalculationEquation("");

    }

}
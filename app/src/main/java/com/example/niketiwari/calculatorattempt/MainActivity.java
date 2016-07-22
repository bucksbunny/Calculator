package com.example.niketiwari.calculatorattempt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Declaring Mode to select either answerField1 or answerField2
    public short mode = 1;
        /*
            1 for answerField1
            2 for answerField2
         */

    //Declaring Mode for decimal point
    boolean decimalPresent = false;

    //Declaring Mode to select Operation

    public short operation = 0;
        /*
            1 for Add
            2 for Subtract
            3 for Multiply
            4 for Divide
         */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Declaring Buttons
        Button number0 = (Button) findViewById(R.id.number0);
        Button number1 = (Button) findViewById(R.id.number1);
        Button number2 = (Button) findViewById(R.id.number2);
        Button number3 = (Button) findViewById(R.id.number3);
        Button number4 = (Button) findViewById(R.id.number4);
        Button number5 = (Button) findViewById(R.id.number5);
        Button number6 = (Button) findViewById(R.id.number6);
        Button number7 = (Button) findViewById(R.id.number7);
        Button number8 = (Button) findViewById(R.id.number8);
        Button number9 = (Button) findViewById(R.id.number9);
        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button divide = (Button) findViewById(R.id.divide);
        final Button decimalPoint = (Button) findViewById(R.id.decimalPoint);
        Button clear = (Button) findViewById(R.id.clear);
        Button equal = (Button) findViewById(R.id.equal);

        //ButtonListener
        number0.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"0");
                    }
                }
        );

        number1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"1");
                    }
                }
        );

        number2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"2");
                    }
                }
        );

        number3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"3");
                    }
                }
        );

        number4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"4");
                    }
                }
        );

        number5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"5");
                    }
                }
        );

        number6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"6");
                    }
                }
        );

        number7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"7");
                    }
                }
        );

        number8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"8");
                    }
                }
        );

        number9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView answerField;
                        if(mode==1)
                            answerField = (TextView)findViewById(R.id.answerField1);
                        else
                            answerField = (TextView)findViewById(R.id.answerField2);
                        answerField.setText(answerField.getText().toString()+"9");
                    }
                }
        );

        decimalPoint.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (decimalPresent == false) {

                            TextView answerField;

                            if (mode == 1)
                                answerField = (TextView) findViewById(R.id.answerField1);
                            else
                                answerField = (TextView) findViewById(R.id.answerField2);

                            answerField.setText(answerField.getText().toString() + ".");
                            decimalPresent=true;
                        }
                    }
                }
        );


        //Declaring Operation Button Listener

        add.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        //mode = 2;
                        operation = 1;
                        TextView answerField1 = (TextView)findViewById(R.id.answerField1);
                        TextView answerField2 = (TextView)findViewById(R.id.answerField2);
                        TextView operationField = (TextView)findViewById(R.id.operationField);
                        operationField.setText("+");
                        answerField2.setText(answerField1.getText());
                        answerField1.setText("");
                        decimalPresent=false;
                    }
                }
        );

        subtract.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //mode = 2;
                        operation = 2;
                        TextView answerField1 = (TextView)findViewById(R.id.answerField1);
                        TextView answerField2 = (TextView)findViewById(R.id.answerField2);
                        TextView operationField = (TextView)findViewById(R.id.operationField);
                        operationField.setText("-");
                        answerField2.setText(answerField1.getText());
                        answerField1.setText("");
                        decimalPresent=false;
                    }
                }
        );

        multiply.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //mode = 2;
                        operation = 3;
                        TextView answerField1 = (TextView)findViewById(R.id.answerField1);
                        TextView answerField2 = (TextView)findViewById(R.id.answerField2);
                        TextView operationField = (TextView)findViewById(R.id.operationField);
                        operationField.setText("x");
                        answerField2.setText(answerField1.getText());
                        answerField1.setText("");
                        decimalPresent=false;
                    }
                }
        );

        divide.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //mode = 2;
                        operation = 4;
                        TextView answerField1 = (TextView)findViewById(R.id.answerField1);
                        TextView answerField2 = (TextView)findViewById(R.id.answerField2);
                        TextView operationField = (TextView)findViewById(R.id.operationField);
                        operationField.setText("/");
                        answerField2.setText(answerField1.getText());
                        answerField1.setText("");
                        decimalPresent=false;
                    }
                }
        );


        //Declaring Clear and Equal Operation Button

        clear.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView answerField1 = (TextView) findViewById(R.id.answerField1);
                        answerField1.setText("");
                        TextView answerField2 = (TextView) findViewById(R.id.answerField2);
                        answerField2.setText("");
                        TextView operationField = (TextView)findViewById(R.id.operationField);
                        operationField.setText("");
                        //mode = 1;
                        operation = 0;
                        decimalPresent=false;
                    }
                }
        );

        equal.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView answerField1 = (TextView)findViewById(R.id.answerField1);
                        TextView answerField2 = (TextView)findViewById(R.id.answerField2);
                        TextView operationField = (TextView)findViewById(R.id.operationField);

                        if(answerField1.getText().toString()=="")
                            return;
                        if(answerField2.getText().toString()=="")
                            return;

                        double num1 = Double.parseDouble(answerField1.getText().toString());
                        double num2 = Double.parseDouble(answerField2.getText().toString());
                        double answer = 0.00;

                        operationField.setText("=");

                        switch (operation)
                        {
                            case 1:
                                answer = num2 + num1;
                                answerField1.setText(String.format("%f", answer));
                                answerField2.setText("");
                                mode = 1;
                                decimalPresent=false;
                                operation=0;
                                break;
                            case 2:
                                answer = num2 - num1;
                                answerField1.setText(String.format("%f", answer));
                                answerField2.setText("");
                                mode = 1;
                                decimalPresent=false;
                                operation=0;
                                break;
                            case 3:
                                answer = num2 * num1;
                                answerField1.setText(String.format("%f", answer));
                                answerField2.setText("");
                                mode = 1;
                                decimalPresent=false;
                                operation=0;
                                break;
                            case  4:
                                answer = num2 / num1;
                                answerField1.setText(String.format("%f", answer));
                                answerField2.setText("");
                                mode = 1;
                                decimalPresent=false;
                                operation=0;
                                break;
                        }

                    }
                }
        );

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Isn't this Calculator Stupid?!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

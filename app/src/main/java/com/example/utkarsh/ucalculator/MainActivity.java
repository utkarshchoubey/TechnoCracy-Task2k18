package com.example.utkarsh.ucalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivide,
            buttonMultiply , buttonDot , buttonClear , buttonEqual ;

    EditText editText ;
    TextView element1,element2,operator1;

    float mValueOne , mValueTwo ;
    int c=1;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button0 = (Button) findViewById(R.id.button0);
         button1 = (Button) findViewById(R.id.button1);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        editText = (EditText) findViewById(R.id.editText);
         element1=(TextView)findViewById(R.id.element1);
         element2=(TextView)findViewById(R.id.element2);
       operator1=(TextView)findViewById(R.id.operator1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v){
                editText.setText(editText.getText()+"2");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
        }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
                if(c==1)
                element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText(editText.getText()+"8");
                if(c==1)
                    element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
                if(c==1)
                    element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());

                }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null){
                    editText.setText("");
                }else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    mAddition = true;
                    c=2;
                    operator1.setText("+");
                    editText.setText(null);


                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mSubtract = true ;
                c=2;
                operator1.setText("-");
                editText.setText(null);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");

                mMultiplication = true ;
                operator1.setText("*");
                c=2;
                editText.setText(null);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText()+"");
                mDivision = true ;
                operator1.setText("/");
                c=2;
                editText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText.getText() + "");

                if (mAddition == true){

                    editText.setText(mValueOne + mValueTwo +"");
                    c=1;
                    mAddition=false;
                }


                if (mSubtract == true){
                    editText.setText(mValueOne - mValueTwo+"");
                    c=1;
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    editText.setText(mValueOne * mValueTwo+"");
                    c=1;
                    mMultiplication=false;
                }

                if (mDivision == true){
                    editText.setText(mValueOne / mValueTwo+"");
                    c=1;
                    //element1.setText(null);
                    //element2.setText(null);

                    mDivision=false;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                element1.setText(null);
                element2.setText(null);
                operator1.setText(null);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
                if(c==1)
                    element1.setText(editText.getText());
                if(c==2)
                    element2.setText(editText.getText());

            }
        });















    }

}

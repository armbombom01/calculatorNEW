package sdu.cs58.wattana.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1.ประกาศตัวแปร
    EditText number1EditText,number2EditText;
    Button addButton,deleteButton,plusButton,dividedButton;
    TextView resultTextView;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.ผู้ตัวแปรบน จาวา กับ อิลิเม้นท์บน XML
        number1EditText = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        deleteButton = findViewById(R.id.btnDe);
        plusButton= findViewById(R.id.btnPlus);
        dividedButton = findViewById(R.id.btnDiv);
        resultTextView = findViewById(R.id.txvResult);

        addButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number1EditText.getText().toString().trim());
                result = num1 + num2;
                resultTextView.setText(result + "");


                deleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                        num2 = Integer.parseInt(number1EditText.getText().toString().trim());
                        result = num1 - num2;
                        resultTextView.setText(result + "");


                        plusButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                num2 = Integer.parseInt(number1EditText.getText().toString().trim());
                                result = num1 * num2;
                                resultTextView.setText(result + "");

                                dividedButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                        num2 = Integer.parseInt(number1EditText.getText().toString().trim());
                                        result = num1 / num2;
                                        resultTextView.setText(result + "");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });


    }
}

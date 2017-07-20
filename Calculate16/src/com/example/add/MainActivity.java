package com.example.add;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText first,secone;
    private Button btn1,btn2,btn3,btn4;
	TextView result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		first = (EditText)findViewById(R.id.first);
		secone = (EditText)findViewById(R.id.secone);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
		result = (TextView)findViewById(R.id.result);
		
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = first.getText().toString();
                String value2 =secone.getText().toString();
                int sum=Integer.parseInt(value1) + Integer.parseInt(value2);
                result.setText(sum+"");
                result.setVisibility(View.VISIBLE);

            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = first.getText().toString();
                String value2 =secone.getText().toString();
                int imsum=Integer.parseInt(value1) - Integer.parseInt(value2);
                result.setText(imsum+"");
                result.setVisibility(View.VISIBLE);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = first.getText().toString();
                String value2 =secone.getText().toString();
                int cheng=Integer.parseInt(value1) * Integer.parseInt(value2);
                result.setText(cheng+"");
                result.setVisibility(View.VISIBLE);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value1 = first.getText().toString();
                String value2 =secone.getText().toString();
                int mod=Integer.parseInt(value1) / Integer.parseInt(value2);
                result.setText(mod+"");
                result.setVisibility(View.VISIBLE);

            }
        });
	}
}

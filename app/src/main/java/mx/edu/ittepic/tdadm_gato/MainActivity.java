package mx.edu.ittepic.tdadm_gato;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
String boton1;
    String boton2;
    String boton3;
    String boton4;
    String boton5;
    String boton6;
    String boton7;
    String boton8;
    String boton9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.boton1);
        btn2=findViewById(R.id.boton2);
        btn3=findViewById(R.id.boton3);
        btn4=findViewById(R.id.boton4);
        btn5=findViewById(R.id.boton5);
        btn6=findViewById(R.id.boton6);
        btn7=findViewById(R.id.boton7);
        btn8=findViewById(R.id.boton8);
        btn9=findViewById(R.id.boton9);


    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btn1.setText("X");
            boton1= btn1.getText().toString().trim();
        }
    });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("X");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText("X");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText("X");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText("X");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText("X");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7.setText("X");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8.setText("X");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setText("X");
            }
        });


        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn1.setText("O");

                return true;
            }
        });
        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn2.setText("O");
                return true;
            }
        });
        btn3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn3.setText("O");
                return true;
            }
        });
        btn4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn4.setText("O");
                return true;
            }
        });
        btn5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn5.setText("O");
                return true;
            }
        });
        btn6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn6.setText("O");
                return true;
            }
        });
        btn7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn7.setText("O");

                return true;
            }
        });
        btn8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn8.setText("O");
                return true;
            }
        });
        btn9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                btn9.setText("O");
                return true;

            }
        });





        if (boton1=="X") {
            Toast.makeText(this, "Gandor X", Toast.LENGTH_SHORT).show();

        }




    }





    }


package bzu.edu.mathapp;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    CheckBox ch;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Password = "Passkey";
    public static final String Check = "false";

    String name;
    String password;
    boolean check;

    SharedPreferences sharedpreferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ch=(CheckBox) findViewById(R.id.check);

        b1=(Button)findViewById(R.id.button);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        check = sharedpreferences.getBoolean(Check ,false);
        ch.setChecked(check);
        name = sharedpreferences.getString(Name, "");
        password = sharedpreferences.getString(Password, "");

//{
        if(check) {

            ed1.setText(name);
            ed2.setText(password);

        }
//}
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.equals(ed1.getText().toString()) && password.equals(ed2.getText().toString())){
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putBoolean(Check, ch.isChecked());
                    editor.apply();
                    Intent intent =new Intent(MainActivity.this ,Home.class);
                    intent.putExtra(Name,sharedpreferences.getString(Name,""));
                    startActivity(intent);

                }
            }
        });
    }

    public void LoadData(View view) {
//{
        String n  = ed1.getText().toString();
        String pw  = ed2.getText().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(Name, n);
        editor.putString(Password, pw);
        editor.putBoolean(Check, ch.isChecked());
        editor.apply();
        Toast.makeText(MainActivity.this,"Thanks",Toast.LENGTH_LONG).show();
//}
    }
}



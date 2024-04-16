package bzu.edu.mathapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {
    public static final String SUBJECT="0";
    String[] subject = {"Limits", "Derivatives", "Integrals"};
    ListView list;
    TextView text;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent =getIntent();

        String name=intent.getStringExtra(MainActivity.Name);

        text=(TextView) findViewById(R.id.text1) ;
        text.setText("Welcome "+name+"\n"+text.getText().toString());


        list =(ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(Home.this , android.R.layout.simple_list_item_1,subject);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(Home.this ,Learning.class);
                intent.putExtra(SUBJECT, String.valueOf(position));
                startActivity(intent);
            }
        });

    }
}
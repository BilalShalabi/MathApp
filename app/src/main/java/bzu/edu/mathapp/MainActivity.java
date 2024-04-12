package bzu.edu.mathapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public static final String SUBJECT="0";
String[] subject = {"Limits", "Derivatives", "Integrals"};
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =(ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1,subject);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(MainActivity.this ,Learning.class);
                intent.putExtra(SUBJECT, String.valueOf(position));
                startActivity(intent);
            }
        });

    }
}
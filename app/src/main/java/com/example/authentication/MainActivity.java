package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText name, city, contact;
   private Spinner spinnerLanguages;
    private Button sendDatabtn;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Employee employe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerLanguages=findViewById(R.id.spinner_languages);
name=(EditText)findViewById(R.id.editTextTextPersonName) ;
        city=(EditText)findViewById(R.id.editTextTextPersonName2) ;
        contact=(EditText)findViewById(R.id.editTextTextPersonName3) ;

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerLanguages.setAdapter(adapter);

sendDatabtn=(Button) findViewById(R.id.button);
sendDatabtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        HashMap<String, Object> m = new HashMap<String , Object>();
        m. put ("Name" , name.getText ().toString());
        m.put ("City" ,city.getText ().toString());
        m.put ("Contact" ,contact.getText ().toString());

        FirebaseDatabase.getInstance().getReference().push().child("User").setValue(m);
    }
});





    }
}
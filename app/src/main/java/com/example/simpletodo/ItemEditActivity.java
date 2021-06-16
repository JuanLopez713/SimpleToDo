package com.example.simpletodo;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.parceler.Parcels;

public class ItemEditActivity extends AppCompatActivity {
    String todo;
    EditText tvEditToDoItem;
    Button btnSubmit;
    Integer position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("ItemEditActivity", "clicked!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_edit);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this::onSubmit);
        todo = getIntent().getStringExtra("toDoItem");
        position = getIntent().getIntExtra("position", 0);
        tvEditToDoItem = (EditText) findViewById(R.id.tvEditTodoItem);
        tvEditToDoItem.setText(todo);
    }

    // ActivityNamePrompt.java -- launched for a result
    public void onSubmit(View v) {
        EditText etName = (EditText) findViewById(R.id.tvEditTodoItem);
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        data.putExtra("toDoItem", etName.getText().toString());
        data.putExtra("position", position);
       // data.putExtra("code", 200); // ints work too
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent
    }
}
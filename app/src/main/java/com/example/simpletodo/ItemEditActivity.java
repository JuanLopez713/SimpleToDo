package com.example.simpletodo;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.parceler.Parcels;

public class ItemEditActivity extends AppCompatActivity {
    String todo;
    EditText tvEditToDoItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("ItemEditActivity", "clicked!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_edit);

        todo = getIntent().getStringExtra("toDoItem");

        tvEditToDoItem = (EditText) findViewById(R.id.tvEditTodoItem);
        tvEditToDoItem.setText(todo);
    }
}
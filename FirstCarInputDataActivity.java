package edu.harvard.cs50.carbonroutes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstCarInputDataActivity extends AppCompatActivity {

    Button next_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstcarinput);

        next_button = (Button)findViewById(R.id.next);

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstCarInputDataActivity.this, InputDataActivity.class);
                startActivity(intent);
            }
        });
    }
}

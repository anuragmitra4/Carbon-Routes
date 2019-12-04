package edu.harvard.cs50.carbonroutes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button fun_facts, can_you_help, personal_stats, add_stats;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fun_facts = (Button)findViewById(R.id.fun_facts);
        can_you_help = (Button)findViewById(R.id.can_you_help);
        personal_stats = (Button)findViewById(R.id.personal_stats);
        add_stats = (Button)findViewById(R.id.add_your_stats);

        fun_facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FunFactsActivity.class);
                startActivity(intent);
            }
        });

        can_you_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CanYouHelpActivity.class);
                startActivity(intent);
            }
        });

        personal_stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PersonalStatsActivity.class);
                startActivity(intent);
            }
        });

        add_stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FirstCarInputDataActivity.class);
                startActivity(intent);
            }
        });
    }
}

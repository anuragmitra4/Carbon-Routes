package edu.harvard.cs50.carbonroutes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CanYouHelpActivity extends AppCompatActivity {

    TextView helpfulfact1, helpfulfact2, helpfulfact3, helpfulfact4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_can_you_help);

        helpfulfact1 = findViewById(R.id.helpfulfact1);
        helpfulfact2 = findViewById(R.id.helpfulfact2);
        helpfulfact3 = findViewById(R.id.helpfulfact3);
        helpfulfact4 = findViewById(R.id.helpfulfact4);

        List<String> recomm = Arrays.asList("Ride a cycle or take a stroll instead of the motor vehicle for reasonable distances.",
                "Carpool on trips that require long distance vehicle travel on the freeway.",
                "Shop with a reusable bag for groceries instead of plastic bags.",
                "Take classes for environmental awareness.",
                "Drink out of reusable bottles, not plastic ones. Save the turtles.",
                "Volunteer for an environmental awareness organization.",
                "Think about electric cars as a possibility.",
                "Use public transit, the biggest type of carpool possible.",
                "Read our fun facts.",
                "Cambridge has an average AQI of 33 which is considered to be great, so keep up what we've been doing!");


        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;

        while (r1 == r2 || r1 == r3 || r1 == r4 || r2 == r3 || r2 == r4 || r3 == r4) {
            Random randomGenerator = new Random();
            r1 = randomGenerator.nextInt(10);
            r2 = randomGenerator.nextInt(10);
            r3 = randomGenerator.nextInt(10);
            r4 = randomGenerator.nextInt(10);
        }

        helpfulfact1.setText(recomm.get(r1));
        helpfulfact2.setText(recomm.get(r2));
        helpfulfact3.setText(recomm.get(r3));
        helpfulfact4.setText(recomm.get(r4));
    }
}

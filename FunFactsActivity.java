package edu.harvard.cs50.carbonroutes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    TextView fact1, fact2, fact3, fact4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfacts);

        fact1 = findViewById(R.id.facts1);
        fact2 = findViewById(R.id.facts2);
        fact3 = findViewById(R.id.facts3);
        fact4 = findViewById(R.id.facts4);

        List<String> funfacts = Arrays.asList("An average American breathes 2 gallons of air per minute which translates to 3400 gallons of air each day.",
                "Inhaling air pollution takes away at least 1-2 years of a typical human life.",
                "It has effects as small as burning eyes and itchy throat to as large as breathing problems and death.",
                "Pollutants that are released into the air, as opposed to land and water pollutants, are the most harmful.  ",
                "Rising levels of air pollution in Beijing has brought a new disease – Beijing cough.  ",
                "Air pollution is not a recent occurrence. In 1952, the Great Smog of London killed 8000 people.  ",
                "Deaths caused by air pollution cost the European Union €161 billion.  ",
                "Producing heavy crude oil increases chances of air pollution by 40% than producing light crude oil. ",
                "According to the Lancet journal, air pollution caused by waiting in traffic increases the chances of death caused due to heart attack.",
                "Toxic air pollution poses a greater threat to children, due to their smaller physical size and lung capacity.",
                "Air pollution and resulting deaths are increasing fastest in Asia.",
                "Air pollution that causes smog affects dolphins and makes them suffer from black lung diseases.",
                "70% of the air pollution caused in Chinese cities is due to tailpipes.",
                "5,000 premature deaths in Southern California are caused due to pollution from diesel trucks.");

        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;

        while (r1 == r2 || r1 == r3 || r1 == r4 || r2 == r3 || r2 == r4 || r3 == r4) {
            Random randomGenerator = new Random();
            r1 = randomGenerator.nextInt(14);
            r2 = randomGenerator.nextInt(14);
            r3 = randomGenerator.nextInt(14);
            r4 = randomGenerator.nextInt(14);

        }

        fact1.setText(funfacts.get(r1));
        fact2.setText(funfacts.get(r2));
        fact3.setText(funfacts.get(r3));
        fact4.setText(funfacts.get(r4));

    }
}

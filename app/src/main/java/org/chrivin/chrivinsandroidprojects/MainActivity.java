package org.chrivin.chrivinsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recyler_view_projects);


        Project[] projects ={
                new Project("Getting Started App", "Our very first project, the default 'Hello World' app!",R.drawable.getting_started),
                new Project("Motivational Quote", "Making a simple change to the layout, with my own favourite quote!",R.drawable.quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods, and Conditional Logic",R.drawable.tape),
                new Project("Inches Converter", "A basic converter to convert Inches to meters (My personal calculator app made on my own)",R.drawable.calculator),
                new Project("Ichiraku Ramen", "A menu app for a fictional restaurant in Naruto's anime, learning about Activities, Classes & Objects, Arrays, Intents, and Listview",R.drawable.ichiraku),
                new Project("Bucket List App", "A bucket list app , teaches me about new layout style like 'gradient','weight','@drawableRes' Annotation  ",R.drawable.androiddev)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);

    }


}
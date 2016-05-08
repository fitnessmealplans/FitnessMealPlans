package nz.ac.cornell.fitnessmealplans;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ProfileActivity extends Activity {

    Spinner spWeight, spHeight, spExercise;
    String[] height = {"feet.inch", "cm"};
    String[] weight = {"lbs", "kg"};
    String[] exercise = {"Little or no Exercise", "Light exercise/sports 1-3 days/week"
            , "Medium exercise/sports 3-5 days/week", "Hard exercise/sports 6-7 days/week"
            , "Medium exercise/sports, physical job or twice/day training"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        spHeight = (Spinner) findViewById(R.id.spHeight);
        spWeight = (Spinner) findViewById(R.id.spWeight);
        spExercise = (Spinner) findViewById(R.id.spExercise);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, height);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spHeight.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, weight);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spWeight.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, exercise);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spExercise.setAdapter(adapter);
    }
}

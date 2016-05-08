package nz.ac.cornell.fitnessmealplans;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TabHost;


public class CalendarActivity extends ActivityGroup {

    TabHost TabHostWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        TabHostWindow = (TabHost)findViewById(android.R.id.tabhost);
    }

    public void onBtnClicked(View v) {
        Intent intent =  new Intent(this, ChooseMealActivity.class);
        Window window =  getLocalActivityManager().startActivity("Sample Activity", intent);
        setContentView(window.getDecorView());
    }
}

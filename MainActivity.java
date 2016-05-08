package nz.ac.cornell.fitnessmealplans;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
                {
                    tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#881261")); //unselected
                    tabHost.getTabWidget().getChildAt(i).setPadding(2,2,2,2);
                }
                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#881255")); // selected
            }
        });

        TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("CALENDAR");
        tabSpec.setIndicator("CALENDAR");
        tabSpec.setContent(new Intent(this, CalendarActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("DAIRY");
        tabSpec.setIndicator("DAIRY");
        tabSpec.setContent(new Intent(this, DairyActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("RECIPE");
        tabSpec.setIndicator("RECIPE");
        tabSpec.setContent(new Intent(this, RecipeActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("PROFILE");
        tabSpec.setIndicator("PROFILE");
        tabSpec.setContent(new Intent(this, ProfileActivity.class));
        tabHost.addTab(tabSpec);
    }
}
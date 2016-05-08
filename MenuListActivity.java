package nz.ac.cornell.fitnessmealplans;


import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;

public class MenuListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
    }

    public void onAddBreakfastClicked(View v) {
        Intent intent = new Intent(MenuListActivity.this, ChooseMealActivity.class);

        v = DairyActivity.group.getLocalActivityManager()
                .startActivity("ChooseMealActivity", intent
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();

        DairyActivity.group.replaceView(v);
    }

    public void onAddLunchClicked(View v) {
        Intent intent = new Intent(MenuListActivity.this, ChooseMealActivity.class);

        v = DairyActivity.group.getLocalActivityManager()
                .startActivity("ChooseMealActivity", intent
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();

        DairyActivity.group.replaceView(v);
    }

    public void onAddDinnerClicked(View v) {
        Intent intent = new Intent(MenuListActivity.this, ChooseMealActivity.class);

        v = DairyActivity.group.getLocalActivityManager()
                .startActivity("ChooseMealActivity", intent
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();

        DairyActivity.group.replaceView(v);
    }
}

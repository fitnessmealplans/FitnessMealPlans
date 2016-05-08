package nz.ac.cornell.fitnessmealplans;


import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;

public class DairyActivity extends ActivityGroup {

    public static DairyActivity group;
    private ArrayList<View> history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_dairy);

        history =  new ArrayList<View>();
        group = this;

        Intent intent = new Intent(DairyActivity.this, MenuListActivity.class);
        View view = getLocalActivityManager().startActivity("MenuListActivity", intent
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();
        replaceView(view);
    }

    public void replaceView(View v) {
        history.add(v);
        setContentView(v);
    }

    public void back() {
        if(history.size()>1) {
            history.remove(history.size()-1);
            setContentView(history.get(history.size()-1));
        } else {
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        group.back();
        return;
    }
}

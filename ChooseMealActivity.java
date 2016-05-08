package nz.ac.cornell.fitnessmealplans;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ChooseMealActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_meal);
    }

    @Override
    public void onBackPressed() {
        DairyActivity parent = ((DairyActivity) getParent());
        parent.onBackPressed();
    }

    public void onAddPersonalClicked (View v) {
        Intent intent = new Intent(ChooseMealActivity.this, AddMenuActivity.class);

        v = DairyActivity.group.getLocalActivityManager()
                .startActivity("AddMenuActivity", intent
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)).getDecorView();

        DairyActivity.group.replaceView(v);
    }
}

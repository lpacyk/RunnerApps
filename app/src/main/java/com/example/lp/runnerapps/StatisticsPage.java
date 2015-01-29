package com.example.lp.runnerapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
/*
import android.view.MenuItem;
*/

public class StatisticsPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_statistics_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final Context context = this;
        Intent intent;
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.person:
                intent = new Intent(context, StartRun.class);
                startActivity(intent);
                return true;
            case R.id.headphones:
                intent = new Intent(context, MusicPage.class);
                startActivity(intent);
                return true;
            case R.id.statistics:
                intent = new Intent(context, StatisticsPage.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

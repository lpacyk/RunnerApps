package com.example.lp.runnerapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ReturnPage extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_page);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, StartRun.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_return_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.person:
                Intent intentPerson = new Intent(this, StartRun.class);
                startActivity(intentPerson);
                return true;
            case R.id.headphones:
                Intent intentHeadphones = new Intent(this, MusicPage.class);
                startActivity(intentHeadphones);
                return true;
            case R.id.statistics:
                Intent intentStatistics = new Intent(this, StatisticsPage.class);
                startActivity(intentStatistics);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

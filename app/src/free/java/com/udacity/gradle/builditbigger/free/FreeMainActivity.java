package com.udacity.gradle.builditbigger.free;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.jokelib.JokeKing;
import com.udacity.gradle.builditbigger.EndpointAsyncTask;
import com.udacity.gradle.builditbigger.JokeReturnHandler;
import com.udacity.gradle.builditbigger.R;

public class FreeMainActivity extends AppCompatActivity implements JokeReturnHandler {

    private static String TAG = FreeMainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new EndpointAsyncTask().execute(this);

        Toast.makeText(this, "Loading new jokes from free debug", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void handleJokeData(String response) {
        Toast.makeText(this, "response received", Toast.LENGTH_SHORT).show();
        Log.d(TAG, response);
    }
}


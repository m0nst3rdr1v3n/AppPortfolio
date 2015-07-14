package app.com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    /**
     *
     * This is for the Spotify Streamer button.
     */
    public void spotifyStreamer(View v){
        Context context = getApplicationContext();
        CharSequence text = "Spotify Streamer COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    /**
     * This is for Scores APP Button.
     */

    public void scoresApp(View v){
        Context context = getApplicationContext();
        CharSequence text = "Scores APP COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    /**
     * This is for the Library APP Button.
     */
    public void libraryApp(View V){
        Context context = getApplicationContext();
        CharSequence text = "Library APP COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    /**
     * This is for the Build It Bigger APP Button.
     */
    public void buildItBigger(View v){
        Context context = getApplicationContext();
        CharSequence text = "Build It Bigger APP COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    /**
     * This is for the XYZ Reader APP Button.
     */
    public void xyzReader(View v){
        Context context = getApplicationContext();
        CharSequence text = "XYZ Reader APP COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    /**
     * This is for the Capstone APP Button.
     */
    public void capstone(View v){
        Context context = getApplicationContext();
        CharSequence text = "Capstone APP COMING SOON!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
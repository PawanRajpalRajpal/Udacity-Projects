package udacity.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/* This activity shows buttons and handles their click event by implementing on click listener. Each click event shows their
* corresponding toast messages.*/

public class PortfolioActivity extends Activity implements View.OnClickListener{

    /*declare all the buttons instances*/
    private Button project1,project2,project3,project4,project5,project6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        /*initialize all the buttons w.r.t. their id's*/
        project1=(Button)findViewById(R.id.button_project1);
        project2=(Button)findViewById(R.id.button_project2);
        project3=(Button)findViewById(R.id.button_project3);
        project4=(Button)findViewById(R.id.button_project4);
        project5=(Button)findViewById(R.id.button_project5);
        project6=(Button)findViewById(R.id.button_project6);


        /*register the listener for all buttons*/
        project1.setOnClickListener(this);
        project2.setOnClickListener(this);
        project3.setOnClickListener(this);
        project4.setOnClickListener(this);
        project5.setOnClickListener(this);
        project6.setOnClickListener(this);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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


    /* handle the click events for all buttons*/
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_project1:
                showToast(R.string.button_msg1);
                break;
            case R.id.button_project2:
                showToast(R.string.button_msg2);
                break;
            case R.id.button_project3:
                showToast(R.string.button_msg3);
                break;
            case R.id.button_project4:
                showToast(R.string.button_msg4);
                break;
            case R.id.button_project5:
                showToast(R.string.button_msg5);
                break;
            case R.id.button_project6:
                showToast(R.string.button_msg6);
                break;
            default:
                break;

        }
    }
    /*show toast on click event of each button*/
    private void showToast(int msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}

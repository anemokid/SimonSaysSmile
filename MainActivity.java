package c4q.nyc.simonsayssmile;
import android.graphics.Color;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private TextView roundCounter;

    String tag = "LifeCycleEvents";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonColors();

    }
//    public void onStart()
//    {
//        super.onStart();
//        Log.d(tag, "In the onStart() event");
//    }
//
//    /* .setRoundCounter():
//    This method will set up the counter element.
//     */
//    private void setRoundCounter() {
//        roundCounter.setText("ROUND #: ");
//
//    } // ends setRoundCounter()

    /* .setButtonColors():
    This method will allow us to access the colors in the resource file [colors.xml] change the button colors
    whenever the user enters a correct letter .
    * */
    public void setButtonColors() {

        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // change the background color to one of the 4 primary colors.
                button_1.setBackgroundColor(Color.MAGENTA);
            }
        }
        );
    } //ends .setButtonColors()

    // method for what happens once the user starts
//    private void onClickMethods() {
//
//    }
//
//    public void onResume()
//    {
//        super.onResume();
//        Log.d(tag, "In the onResume() event");
//    }
//
//    public void onPause()
//    {
//        super.onPause();
//        Log.d(tag, "In the onPause() event");
//    }
} //ends main activity

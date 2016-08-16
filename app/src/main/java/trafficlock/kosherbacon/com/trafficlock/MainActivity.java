package trafficlock.kosherbacon.com.trafficlock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation welcomeAnim = new AlphaAnimation(0.2f, 1.0f);
        welcomeAnim.setDuration(4 * 1000);
        TextView welcomeMsg = (TextView) findViewById(R.id.welcome_msg);
        welcomeMsg.startAnimation(welcomeAnim);
    }
}

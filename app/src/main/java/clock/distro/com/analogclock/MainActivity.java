package clock.distro.com.analogclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;
//import android.widget.DigitalClock;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalogClock ac = (AnalogClock)findViewById(R.id.analogClock1);

        //DigitalClock dc= (DigitalClock)findViewById(R.id.digitalClock1);

        TextClock tc = (TextClock)findViewById(R.id.textClock1);

    }
}

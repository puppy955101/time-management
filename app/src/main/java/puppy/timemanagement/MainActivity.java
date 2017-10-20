package puppy.timemanagement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences SP = getSharedPreferences("data", MODE_PRIVATE);
        LinearLayout LL = (LinearLayout) findViewById(R.id.linearLayout);
        int now = SP.getInt("now", -1);
        for(int i=0;i<now;i++) {
            String s = SP.getString(Integer.toString(i), "FUCK");
            TextView tv = new TextView(this);
            tv.setText(s);
            LL.addView(tv);
        }
        Button add = new Button(this);
        add.setText("add");
        LL.addView(add);
        add.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View arg0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,add_something.class);
                    startActivity(intent);
                }
            });
    }
}

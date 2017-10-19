package puppy.timemanagement;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button)findViewById(R.id.button);
        add.setOnClickListener(new Button.OnClickListener(){
                public void onClick(View arg0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,add_something.class);
                    startActivity(intent);
                }
            });
    }
}

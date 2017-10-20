package puppy.timemanagement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by charles on 2017/10/18.
 */
public class add_something extends ActionBarActivity {
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_mode);
        et = (EditText) findViewById(R.id.editText);
        Button add = (Button) findViewById(R.id.button1);
        add.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                SharedPreferences SP = getSharedPreferences("data", MODE_PRIVATE);
                SP.edit().putString("add", et.getText().toString()).apply();
                Intent intent = new Intent();
                intent.setClass(add_something.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

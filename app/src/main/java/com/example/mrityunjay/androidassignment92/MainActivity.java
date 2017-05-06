package com.example.mrityunjay.androidassignment92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring id
    private static final int item_1 = Menu.FIRST;
    private static final int item_2 = Menu.FIRST + 1;
    private static final int item_3 = Menu.FIRST + 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override// on create option  method
    public boolean onCreateOptionsMenu(Menu menu) {
    // adding menu id,title

        menu.add(0, item_1, 0, "setting");
        menu.add(0, item_2, 0, "profile");
        menu.add(0, item_3, 0, "tool");
        return true;

    }

    @Override// on select item
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();// adapter
        switch (item.getItemId()) {
            case item_1:
                Toast.makeText(getApplicationContext(), "click on setting", Toast.LENGTH_SHORT).show();// toast for show

                return true;
            case item_2:
                Toast.makeText(getApplicationContext(), "click on profile", Toast.LENGTH_SHORT).show();

                return true;
            case item_3:
                Toast.makeText(getApplicationContext(), "click on tool", Toast.LENGTH_SHORT).show();

            default:
                return super.onContextItemSelected(item);
        }

    }
}

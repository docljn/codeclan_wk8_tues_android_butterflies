package example.docljn.com.butterflies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ButterflyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly_list_activity);

        ArrayList<Butterfly> data = new ButterflyList().getList();

        ListView listView = findViewById(R.id.list_view);


        ButterflyAdapter butterflyAdapter = new ButterflyAdapter(this, data);
        listView.setAdapter(butterflyAdapter);

    }
}

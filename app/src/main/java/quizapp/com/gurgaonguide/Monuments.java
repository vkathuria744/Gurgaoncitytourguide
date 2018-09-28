package quizapp.com.gurgaonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_location_list);
        final ArrayList<Content> monuments = new ArrayList<Content>();
        monuments.add(new Content(R.string.ghausalishah, R.string.ghausalishah_address, R.string.ghausalishah_des, R.drawable.firstm, 4.2 ));
        monuments.add(new Content(R.string.farrukhnagarfort, R.string.ghausalishah_address, R.string.farrukhnagarfort_des, R.drawable.fourthm, 4.1));
        monuments.add(new Content(R.string.pataudipalace, R.string.pataudipalace_address, R.string.pataudipalace_des, R.drawable.secondm, 4.4));
        monuments.add(new Content(R.string.aliwardimasjid, R.string.aliwardimasjid_address, R.string.aliwardimasjid_des, R.drawable.thirdm, 4.0));

        ActivityLocationAdapter adapter = new ActivityLocationAdapter(this, monuments);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

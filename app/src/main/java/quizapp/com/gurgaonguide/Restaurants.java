package quizapp.com.gurgaonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_location_list);
        final ArrayList<Content> restaurants = new ArrayList<Content>();
        restaurants.add(new Content(R.string.thaipavilion, R.string.thaipavilion_address, R.string.thaipavilion_des, R.drawable.firstr, 4.2));
        restaurants.add(new Content(R.string.whiskysambahorizoncenter, R.string.whiskysambahorizoncenter_address, R.string.whiskysambahorizoncenter_des, R.drawable.secondr, 4.1));
        restaurants.add(new Content(R.string.amarantatheoberoi, R.string.amarantatheoberoi_address, R.string.amarantatheoberoi_des, R.drawable.thirdr, 4.2));
        restaurants.add(new Content(R.string.spectratheleelaambience, R.string.spectratheleelaambience_address, R.string.spectratheleelaambience_des, R.drawable.fourthr, 4.3));

        ActivityLocationAdapter adapter = new ActivityLocationAdapter(this, restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}

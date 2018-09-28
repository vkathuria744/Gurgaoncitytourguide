package quizapp.com.gurgaonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_location_list);
        final ArrayList<Content> hotels = new ArrayList<Content>();
        hotels.add(new Content(R.string.thetrident, R.string.thetrident_address, R.string.thetrident_des, R.drawable.secondr, 4.3));
        hotels.add(new Content(R.string.theoberoi, R.string.theoberoi_address, R.string.theoberoi_des, R.drawable.firstr, 4.2));
        hotels.add(new Content(R.string.courtyardbymarriottgurugramdowntown, R.string.courtyardbymarriottgurugramdowntown_address, R.string.courtyardbymarriottgurugramdowntown_des, R.drawable.fourthr, 4.1));
        hotels.add(new Content(R.string.lemeridien, R.string.lemeridien_address, R.string.lemeridien_des, R.drawable.thirdr , 4.4));

        ActivityLocationAdapter adapter = new ActivityLocationAdapter(this, hotels);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
package quizapp.com.gurgaonguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Cafes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_location_list);
        final ArrayList<Content> cafes = new ArrayList<Content>();
        cafes.add(new Content(R.string.themadteapotgolfcourseroad, R.string.themadteapotgolfcourseroad_address, R.string.themadteapotgolfcourseroad_des, R.drawable.thirdr, 4.3 ));
        cafes.add(new Content(R.string.dighentcafe, R.string.dighentcafe_address, R.string.dighentcafe_des, R.drawable. firstr, 4.2));
        cafes.add(new Content(R.string.anotherfineday, R.string.anotherfineday_address, R.string.anotherfineday_des, R.drawable.secondr, 4.1));
        cafes.add(new Content(R.string.cafeamaretto, R.string.cafeamaretto_address, R.string.cafeamaretto_des, R.drawable.fourthr, 4.5));

        ActivityLocationAdapter adapter = new ActivityLocationAdapter(this, cafes);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
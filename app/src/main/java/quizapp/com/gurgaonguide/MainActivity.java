package quizapp.com.gurgaonguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Monuments = (TextView)findViewById(R.id.monuments);
        Monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MonumentsIntent = new Intent(MainActivity.this,Monuments.class);
                startActivity(MonumentsIntent);
            }
        });

        TextView Restaurants = (TextView)findViewById(R.id.restaurants);
        Restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RestaurantsIntent = new Intent(MainActivity.this,Restaurants.class);
                startActivity(RestaurantsIntent);
            }
        });

        TextView Hotels = (TextView)findViewById(R.id.hotels);
        Hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HotelsIntent = new Intent(MainActivity.this,Hotels.class);
                startActivity(HotelsIntent);
            }
        });

        TextView Cafes = (TextView)findViewById(R.id.cafes);
        Cafes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CafesIntent = new Intent(MainActivity.this,Cafes.class);
                startActivity(CafesIntent);
            }
        });
    }
}

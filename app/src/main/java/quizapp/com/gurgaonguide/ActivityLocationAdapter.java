package quizapp.com.gurgaonguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityLocationAdapter extends ArrayAdapter<Content> {

    private static final String LOG_TAG = ActivityLocationAdapter.class.getSimpleName();

    public ActivityLocationAdapter(Activity context, ArrayList<Content> contents) {

        super(context, 0, contents);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_content, parent, false);

        }

        Content currentContent = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentContent.getTitle());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentContent.getAddress());

        TextView materialTextView = (TextView) listItemView.findViewById(R.id.material);
        materialTextView.setText(currentContent.getMaterial());

        RatingBar rating = (RatingBar) listItemView.findViewById(R.id.rating);
        rating.setRating(currentContent.getRating());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_content);
        if(currentContent.hasImage()) {
            iconView.setImageResource(currentContent.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);

        }else
            iconView.setVisibility(View.GONE);

        return listItemView;
        }


}

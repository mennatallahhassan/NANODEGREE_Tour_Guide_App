package sixth.ntl.com.tourguide2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by boody 2 on 05/03/2017.
 */

public class ImageRestaurantAdapter extends ArrayAdapter {

    List<Restaurant> restaurantList;
    private Context context;

    public ImageRestaurantAdapter(Context context, int resource, List<Restaurant> restaurantList) {
        super(context, resource, restaurantList);
        this.restaurantList = restaurantList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = LayoutInflater.from(context).inflate(R.layout.restaurant_third_item, parent, false);
        ImageView img = (ImageView) row.findViewById(R.id.img);
        TextView title = (TextView) row.findViewById(R.id.rest_textView_item);

        Restaurant restaurantObject = restaurantList.get(position);
        img.setImageResource(restaurantObject.getImg());
        title.setText(restaurantObject.getName() + "\n" + restaurantObject.getLocation());

        //Picasso.with(context).load(movieList.get(position).getImage()).into(imageView);
        return row;
        //return super.getView(position, convertView, parent);
    }
}

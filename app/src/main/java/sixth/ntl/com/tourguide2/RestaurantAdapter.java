package sixth.ntl.com.tourguide2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by boody 2 on 05/03/2017.
 */

public class RestaurantAdapter extends ArrayAdapter {

    List<Restaurant> restaurantList;
    private Context context;
    private int resource;

    public RestaurantAdapter(Context context, int resource, List<Restaurant> restaurantList) {
        super(context, resource, restaurantList);
        this.restaurantList = restaurantList;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = LayoutInflater.from(context).inflate(resource, parent, false);
        TextView title = (TextView) row.findViewById(R.id.rest_textView_item);

        Restaurant restaurantObject = restaurantList.get(position);
        title.setText(restaurantObject.getName() + "\n" + restaurantObject.getLocation());

        return row;
    }
}

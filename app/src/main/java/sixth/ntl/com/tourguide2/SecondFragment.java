package sixth.ntl.com.tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        List<Restaurant> restaurantList = new ArrayList<>();
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setName(getString(R.string.name_second));
        restaurant1.setLocation(getString(R.string.address_second));
        restaurantList.add(restaurant1);


        Restaurant restaurant2 = new Restaurant();
        restaurant2.setName(getString(R.string.name_second));
        restaurant2.setLocation(getString(R.string.address_second));
        restaurantList.add(restaurant2);

        Restaurant restaurant3 = new Restaurant();
        restaurant2.setName(getString(R.string.name_second));
        restaurant2.setLocation(getString(R.string.address_second));
        restaurantList.add(restaurant2);

        ListView restaurantListView = (ListView) view.findViewById(R.id.restaurant_ListView_view_first);
        RestaurantAdapter restaurantAdapter = new RestaurantAdapter(getContext(), R.layout.restaurant_first_item, restaurantList);
        restaurantListView.setAdapter(restaurantAdapter);

        return view;
    }
}

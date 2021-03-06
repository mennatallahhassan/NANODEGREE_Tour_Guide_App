package sixth.ntl.com.tourguide2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ThirdFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);

        List<Restaurant> restaurantList = new ArrayList<>();
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setImg(R.drawable.pizzaking);
        restaurant1.setName(getString(R.string.name_forth));
        restaurant1.setLocation(getString(R.string.address_forth));
        restaurantList.add(restaurant1);


        Restaurant restaurant2 = new Restaurant();

        restaurant2.setImg(R.drawable.pizzaking);
        restaurant2.setName(getString(R.string.name_forth));
        restaurant2.setLocation(getString(R.string.address_forth));
        restaurantList.add(restaurant2);

        ListView restaurantListView = (ListView) view.findViewById(R.id.restaurant_ListView_view_first);
        ImageRestaurantAdapter restaurantAdapter = new ImageRestaurantAdapter(getContext(), R.layout.restaurant_third_item, restaurantList);
        restaurantListView.setAdapter(restaurantAdapter);

        return view;
    }

}

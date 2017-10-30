package com.max.simpleweather.screen.weatherlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.simpleweather.R;
import com.max.simpleweather.model.City;

/**
 * @author Artur Vasilov
 */
public class CityHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.city_name)
    TextView mCityName;

    @BindView(R.id.temperature)
    TextView mTemperature;

    public CityHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(@NonNull City city) {
        mCityName.setText(city.getName());
        if (city.getMain() != null) {
            String temp = mTemperature.getResources().getString(R.string.f_temperature, city.getMain().getTemp());
            mTemperature.setText(temp);
        }
    }
}

package me.dio.simulator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

public class MainActivityJava extends AppCompatActivity {
    private ActivityMainBinding bilding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bilding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bilding.getRoot());

    }
}

package com.miapp.listadeinmueble.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.miapp.listadeinmueble.R;
import com.miapp.listadeinmueble.databinding.ActivityMainBinding;
import com.miapp.listadeinmueble.model.Inmueble;
import com.miapp.listadeinmueble.ui.adapters.ListaAdapter;
import com.miapp.listadeinmueble.ui.viewModel.MainActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private MainActivityViewModel viewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
       viewModel.getMutable().observe(this, new Observer<List<Inmueble>>() {
           @Override
           public void onChanged(List<Inmueble> inmuebles) {
               ArrayAdapter<Inmueble> adapter = new ListaAdapter(MainActivity.this, R.layout.item, viewModel.getLista(), getLayoutInflater());
               ListView lv = findViewById(R.id.milista);
               lv.setAdapter(adapter);
           }
       });




    }

}
package com.example.recyclerviewa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Negara ini menggunakan bendera berwarna merah.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Hungary");
        nm.setDeskripsi("Negara ini bernama Hungaria dalam bahasa Indonesia.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDeskripsi("Negara Slovenia dekat dalam perbatasan di Russia.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDeskripsi("Belgium berada di area Eropa.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Negara Canada terkenal dengan jaringan yang cepat.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);
    }
}
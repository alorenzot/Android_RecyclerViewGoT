package es.ieslavereda.android_rvgot_base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import es.ieslavereda.android_rvgot_base.model.Personaje;
import es.ieslavereda.android_rvgot_base.model.PersonajeRepository;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter mrva;
    private PersonajeRepository personajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personajes=PersonajeRepository.getInstance();
        recyclerView=findViewById(R.id.recyclerView);
        mrva = new MyRecyclerViewAdapter(this,personajes);
        mrva.setLayout(R.layout.recycler_grid_item);
        mrva.setListener(this);
        recyclerView.setAdapter(mrva);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
    @Override
    public void onClick(View view) {
        int position = recyclerView.getChildAdapterPosition(view);
        Personaje personaje = mrva.getPersonaje(position);
        Toast.makeText(
                        this,
                        "Realizado clic sobre: " + personaje.getNombre(),
                        Toast.LENGTH_LONG)
                .show();
    }
}
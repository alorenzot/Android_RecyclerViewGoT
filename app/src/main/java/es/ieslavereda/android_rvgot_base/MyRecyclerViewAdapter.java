package es.ieslavereda.android_rvgot_base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import es.ieslavereda.android_rvgot_base.model.Personaje;
import es.ieslavereda.android_rvgot_base.model.PersonajeRepository;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>{

    private PersonajeRepository personajes;
    private Context context;
    private LayoutInflater layoutInflater;
    private int layout;
    private View.OnClickListener listener;


    public MyRecyclerViewAdapter(Context context, PersonajeRepository personajes) {
        super();
        this.personajes = personajes;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(layout,parent,false);
        view.setOnClickListener(listener);
        return new MyViewHolder(view);
    }
    public void setLayout(int layout) {
        this.layout = layout;
    }

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public Personaje getPersonaje(int position){
        return personajes.get(position);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Personaje personaje = personajes.get(position);

        holder.tvNombre.setText(personaje.getNombre());
        holder.tvCasa.setText(personaje.getCasa().getNombre());
        holder.ivCasa.setImageResource(personaje.getCasa().getEscudo());

    }

    @Override
    public int getItemCount() {
        return personajes.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCasa;
        TextView tvNombre;
        TextView tvCasa;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCasa = itemView.findViewById(R.id.ivCasa);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvCasa = itemView.findViewById(R.id.tvCasa);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}

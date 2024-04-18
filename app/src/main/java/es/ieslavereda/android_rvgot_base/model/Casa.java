package es.ieslavereda.android_rvgot_base.model;

import es.ieslavereda.android_rvgot_base.R;

public enum Casa {

    ARRYN("Arryn", R.mipmap.ic_arryn_foreground),
    BARATHEON("Baratheon", R.mipmap.ic_baratheon_foreground),
    GREYJOY("Greyjoy", R.mipmap.ic_greyjoy_foreground),
    LANNISTER("Lannister", R.mipmap.ic_lannister_foreground),
    STARK("Stark", R.mipmap.ic_stark_foreground),
    TARGARYEN("Targaryen", R.mipmap.ic_targaryen_foreground),
    TULLY("Tully", R.mipmap.ic_tully_foreground),
    TYRELL("Tyrell", R.mipmap.ic_tyrell_foreground);

    private String nombre;
    private int escudo;

    Casa(String nombre, int escudo) {
        this.nombre = nombre;
        this.escudo = escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEscudo() {
        return escudo;
    }
}

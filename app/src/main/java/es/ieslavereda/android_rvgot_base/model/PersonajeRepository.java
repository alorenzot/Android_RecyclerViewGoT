package es.ieslavereda.android_rvgot_base.model;

import java.util.ArrayList;
import java.util.List;

public class PersonajeRepository {
    private List<Personaje> personajes;
    public static PersonajeRepository instance;

    private PersonajeRepository() {
        personajes = new ArrayList<>();
        personajes.add(new Personaje("Tyrion Lannister", Casa.LANNISTER));
        personajes.add(new Personaje("Cersei Lannister", Casa.LANNISTER));
        personajes.add(new Personaje("Daenerys Targaryen", Casa.TARGARYEN));
        personajes.add(new Personaje("Jon Nieve", Casa.STARK));
        personajes.add(new Personaje("Sansa Stark", Casa.STARK));
        personajes.add(new Personaje("Arya Stark", Casa.STARK));
        personajes.add(new Personaje("Jaime Lannister", Casa.LANNISTER));
        personajes.add(new Personaje("Theon Greyjoy", Casa.GREYJOY));
        personajes.add(new Personaje("Yara Greyjoy", Casa.GREYJOY));
        personajes.add(new Personaje("Euron Greyjoy", Casa.GREYJOY));
        personajes.add(new Personaje("Robert Arryn", Casa.ARRYN));
        personajes.add(new Personaje("Lisa Arryn", Casa.ARRYN));
        personajes.add(new Personaje("Edmure Tully", Casa.TULLY));
        personajes.add(new Personaje("Ser Brynden Tully", Casa.TULLY));
        personajes.add(new Personaje("Tommen Baratheon", Casa.BARATHEON));
        personajes.add(new Personaje("Renly Baratheon", Casa.BARATHEON));
        personajes.add(new Personaje("Myrcella Baratheon", Casa.BARATHEON));
        personajes.add(new Personaje("Mace Tyrell", Casa.TYRELL));
        personajes.add(new Personaje("Mina Tyrell", Casa.TYRELL));
        personajes.add(new Personaje("Brandon Stark", Casa.STARK));
        personajes.add(new Personaje("Catelyn Stark", Casa.STARK));
        personajes.add(new Personaje("Robb Stark", Casa.STARK));
    }

    public static PersonajeRepository getInstance() {
        if (instance == null) {
            instance = new PersonajeRepository();
        }
        return instance;
    }

    public Personaje get(int index) {
        return personajes.get(index);
    }

    public int size() {
        return personajes.size();
    }

    public void remove(Personaje usuario) { personajes.remove(usuario); }

    public void add(Personaje usuario) { personajes.add(usuario); }

    public void add(int index, Personaje usuario) { personajes.add(index, usuario); }


}

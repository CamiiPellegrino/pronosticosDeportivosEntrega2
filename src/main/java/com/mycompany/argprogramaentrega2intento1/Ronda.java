package com.mycompany.argprogramaentrega2intento1;


import java.util.ArrayList;

public class Ronda {
    private ArrayList<Partido> partidos = new ArrayList<>();
    private int idRonda;

    //CONSTRUCTOR
    public Ronda(int idRonda)
    {
        this.idRonda=idRonda;
    }
    public int getIdRonda()
    {
        return idRonda;
    }

    public ArrayList<Partido> getPartidos()
    {
        return partidos;
    }

    public Partido buscarPartido(String nomEquipo1, String nomEquipo2)
    {
        for(Partido p : partidos){
            if(p.getEquipo1().getNombre().equals(nomEquipo1) & p.getEquipo2().getNombre().equals(nomEquipo2))
            {
                return p;
            }
        }
        return null;
    }
    
    public void agregarPartido(Partido p)
    {
        this.partidos.add(p);
    }
    
    
    
    
}

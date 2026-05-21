package model;

public class JuegoInfantil extends Atraccion {

    private int edadMaximaAnios;
    private boolean supervisionPermanente;

    public JuegoInfantil(String nombre, String zonaUbicacion, int capacidadMaxima, int edadMinimaAnios, int visitantesPorDia, double precioEntrada, int edadMaximaAnios, boolean supervisionPermanente){
        super(nombre, zonaUbicacion, capacidadMaxima, edadMinimaAnios, visitantesPorDia, precioEntrada);
        this.edadMaximaAnios = edadMaximaAnios;
        this.supervisionPermanente = supervisionPermanente;
    }

    @Override
    public double calcularIngresoDiario(){
        double ingreso = visitantesPorDia * precioEntrada;
        if(supervisionPermanente)
           ingreso += 50000 * visitantesPorDia;
        return ingreso;
    }
}
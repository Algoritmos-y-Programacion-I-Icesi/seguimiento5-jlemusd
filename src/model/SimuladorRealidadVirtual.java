package model;

public class SimuladorRealidadVirtual extends Atraccion implements ClasificableRiesgo{

    private int numeroEstaciones;
    private boolean requiereAnteojos;

    public SimuladorRealidadVirtual(String nombre, String zonaUbicacion, int capacidadMaxima, int edadMinimaAnios, int visitantesPorDia, double precioEntrada, int numeroEstaciones, boolean requiereAnteojos){
        super(nombre, zonaUbicacion, capacidadMaxima, edadMinimaAnios, visitantesPorDia, precioEntrada);
        this.numeroEstaciones = numeroEstaciones;
        this.requiereAnteojos = requiereAnteojos;
    }

    @Override
    public double calcularIngresoDiario(){
        double ingreso = visitantesPorDia * precioEntrada;
        if(!requiereAnteojos)
           ingreso = ingreso * 0.90;
        return ingreso;
    }

    @Override
    public String getNivelRiesgo(){
        if (requiereAnteojos & numeroEstaciones > 20){
            return "ALTO";
        } else if (requiereAnteojos || numeroEstaciones > 20){
            return "MEDIO";
        }else{
            return "BAJO";

        }
    }
}
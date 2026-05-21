package model;

public class EspectaculoPirotecnico extends Atraccion implements ClasificableRiesgo {

    private int duracionMinutos;
    private boolean materialPeligrosoCertificado;

    public EspectaculoPirotecnico(String nombre, String zonaUbicacion, int capacidadMaxima, int edadMinimaAnios, int visitantesPorDia, double precioEntrada, int duracionMinutos, boolean materialPeligrosoCertificado){
        super(nombre, zonaUbicacion, capacidadMaxima, edadMinimaAnios, visitantesPorDia, precioEntrada);
        this.duracionMinutos = duracionMinutos;
        this.materialPeligrosoCertificado = materialPeligrosoCertificado;
    }

    @Override
    public double calcularIngresoDiario(){
        double ingreso = visitantesPorDia * precioEntrada;
        if(materialPeligrosoCertificado)
           ingreso = ingreso * 1.20;
        return ingreso;
    }

    @Override
    public String getNivelRiesgo(){
        if (materialPeligrosoCertificado){
            return "ALTO";
        } else if (duracionMinutos > 60){
            return "MEDIO";
        }else{
            return "BAJO"

        }
    }
}
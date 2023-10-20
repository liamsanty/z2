
public abstract class Animal {
    private String sonidos;
    private String alimentos;
    private String habitat;
    private String nombreCientifico;

    public Animal(String sonidos, String alimentos, String habitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    void imprimir()
    System.out.println("sonido = " + sonidos);
    System.out.println("alimentos = " + alimentos);
    System.out.println("habitat = " + habitat);
    System.out.println("nombre cientifico = " + nombreCientifico);
}

abstract void sonido(String sonidos);
abstract void alimentos(String alimentos);
abstract void habitat(String habitat);
abstract void nombreCientifico(String nombreCientifico);

public String getSonidos(){
    return sonidos;
}

public String getAlimentos(String alimentos){
    return alimentos;
     }

public String getHabitat(String habitat){


    return habitat;
}
public String getNombreCientífico(String nombreCientifico) {
    return nombreCientifico;
}

















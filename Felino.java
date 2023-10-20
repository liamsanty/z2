
    public class Felino extends Animal {
        public Felino(String sonidos, String alimentos, String habitat, String nombreCientífico) {
            super(sonidos, alimentos, habitat, nombreCientífico);
        }
    
        @Override
        public String getSonido() {
            return sonidos;
        }
    
        @Override
        public String getAlimentos() {
            return alimentos;
        }
    
        @Override
        public String getHabitat() {
            return habitat;
        }
    
        @Override
        public String getNombreCientifico() {
            return nombreCientifico;
        }
}

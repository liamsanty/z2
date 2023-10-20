public class Canino extends Animal {

        public Canino(String sonidos, String alimentos, String habitat, String nombreCientifico) {
            super(sonidos, alimentos, habitat, nombreCientifico);
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


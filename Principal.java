public class Principal {
        public static void main(String[] args) {
            Animal[] animales = new Animal[4];
            animales[0] = new Perro();
            animales[1] = new Lobo();
            animales[2] = new Leon();
            animales[3] = new Gato();
    
            for (Animal animal : animales) {
                System.out.println("Nombre Científico: " + animal.getNombreCientífico());
                System.out.println("Sonido: " + animal.getSonido());
                System.out.println("Alimentos: " + animal.getAlimentos());
                System.out.println("Hábitat: " + animal.getHábitat());
                System.out.println();
            }
        }
    }
    


public class app {
    public static void main(String[] args){
        Persona p = new Persona();
        try {
            p.setEdad(15);
        } catch (EdadMinimaException e) {
            e.printStackTrace();
        }
    }
}

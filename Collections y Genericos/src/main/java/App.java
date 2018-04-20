import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args){
        /*
        List<String> m = new LinkedList<String>(); //Siempre
        m.add("Hola");
        m.add("mundo");

        Iterator<String> it = m.iterator();

        while (it.hasNext()){
            String elemento = it.next();
            System.out.println(elemento);
        }

        System.out.println(m);

        m.add("cruel");

        for (String string: m) {
            System.out.println(string);
        }

        System.out.println(m + " " + m.size());
        */

        Sumador<Persona> s = new Sumador<Persona>();
        Sumador<Monitor> r = new Sumador<Monitor>();
        Persona p = new Persona();
        Monitor m = new Monitor();


        System.out.println(p.toString() + m.toString());
        s.incrementar(p);
        r.incrementar(m);
        System.out.println(p.toString() + m.toString());

        Sumable t[] = new Sumable[2];

        t[0] = new Persona();
        t[1] = new Monitor();

        for (int i = 0 ; i< t.length ; i++){
            t[i].increment();
            System.out.println(t[i].toString());
        }
    }
}
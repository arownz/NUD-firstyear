package Character;

public class Main {

    public static void main(String[] args) {
        Enemy e = new Enemy();
        e.attack();
        e.skill();
        e.item();
        e.run(); 
        
        Robot r = new Robot();
        r.attack();
        r.skill();
        r.item();
        r.run(); 
        
        Human h = new Human();
        h.attack();
        h.skill();
        h.item();
        h.run(); 
        
        Beast u = new Beast();
        u.attack();
        u.skill();
        u.item();
        u.run(); 
    }
}
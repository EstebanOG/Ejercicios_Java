public class Launcher {

    public static void main(String[] args) {
        persona p1=new persona("juan", "perez",21);
        persona p2=new persona("david", "gomez",72);
        persona p3=new persona("julio", "lopez",34);
        persona p4=new persona("jose", "ramirez",44);
        
        Banco banco = new Banco();
        banco.atende(p1);
        
        banco.suspendeVentanilla();
        banco.atende(p2);
        banco.atende(p3);
        
        banco.cerraVentanilla();
        banco.atende(p4);
    }
    
}


package banco;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Banco {

    public static void main(String[] args) {
        Cuenta cuentapesos= new Cuenta("Matias",2000);
        Cuenta cuentadolares=new Cuenta("Mathias",100);
        //ingresar dinero
        cuentapesos.ingresar(1000);
        cuentadolares.ingresar(300);
        //extraer dinero
        cuentadolares.retirar(200);
        cuentapesos.retirar(2300);
        //mostramos la informacion
        System.out.println(cuentapesos);
        System.out.println(cuentadolares);
        
    }
    
    
}

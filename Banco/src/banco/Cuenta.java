
package banco;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class Cuenta {
    
    //atributo
    private String titular;
    private double importe;
    
    //construir las cuentas usando un constructor
    public Cuenta(String Titular, double Importe){
        this.titular= Titular;
        this.importe= Importe;
        
    }
    public void ingresar(double Importe){
        if(Importe>0){
            this.importe+=Importe;
        }
    }
    
    public void retirar(double Importe){
        if(this.importe-Importe < 0){
            this.importe=0;
        }else{
            this.importe-=Importe;
        }
    }

    @Override
    public String toString() {
        return "El titular: " + titular+"tiene un saldo: "+importe;
    }
   
}

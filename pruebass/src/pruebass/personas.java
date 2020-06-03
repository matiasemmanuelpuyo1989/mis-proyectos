/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebass;

/**
 *
 * @author Matias Emmanuel Puyo
 */
public class personas {
    private int dni;
   private String apellido;
   private String nombre;
   
   public personas(int dni) {
      this.dni=dni;
   }
   public personas(int dni,String apellido) {
      this.dni=dni;
      this.apellido=apellido;
   }
       
}


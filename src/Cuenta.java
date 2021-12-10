/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Cuenta extends Alumno {
    
    private String cuenta;
    public Cuenta(){
        
    }
    public Cuenta (String _cuenta){
     this.setCuenta(_cuenta);   
    }
    public void setCuenta(String _cuenta){
      this.cuenta = _cuenta;
    }
    public String getCuenta(){
        return this.cuenta;
    }
}

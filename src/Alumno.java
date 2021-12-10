/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Alumno {
    private String Nombre;
    private String Apellido;

    public Alumno (){
        
    }
    public Alumno (String _Nombre, String _Apellido){
        this.setNombre(_Nombre);
        this.setApellido(_Apellido);
    }
    public void setNombre(String _Nombre){
        this.Nombre = _Nombre;
    }
    public void setApellido(String _Apellido){
        this.Apellido = _Apellido;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getApellido(){
        return this.Apellido;
    }
}

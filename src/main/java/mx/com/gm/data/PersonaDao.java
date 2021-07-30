/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.data;
import mx.com.gm.domain.Persona;
import java.util.List;

/**
 *
 * @author MrSoundMaurix
 * @name Rene Ipiales
 */
public interface PersonaDao {
    public List<Persona>encontrarTodasPersonas();
    public Persona encontrarPersona(Persona persona);
    public void insertarPersona(Persona persona);
    public void actualizarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
    
    
    
}

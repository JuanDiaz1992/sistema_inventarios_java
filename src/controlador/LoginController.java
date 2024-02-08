/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import model.LoginDAO;
import model.UserData;

/**
 *
 * @author ranaclay
 */
public class LoginController {
    public ArrayList<Object> logeo(String username, String password){
        LoginDAO log = new LoginDAO();
        ArrayList<Object> resultado = log.requestLogin(username, password);
        if (resultado != null) {
            return resultado;
        } else {
            return null;
        }

    }
    
}

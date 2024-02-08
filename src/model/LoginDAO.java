
package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;



public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public ArrayList<Object> requestLogin(String user, String pass){
        String sql = "SELECT * FROM profile_user WHERE username = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs= ps.executeQuery();
            if(rs.next()){
                String hashPassword = rs.getString("password");
                if (hashPassword.startsWith("$2y$")) {
                    hashPassword = "$2a$" + hashPassword.substring(4);
                }
                boolean passwordMatch = BCrypt.checkpw(pass, hashPassword);
                if(passwordMatch){
                    ArrayList<Object> lista = new ArrayList<>();
                    lista.add(rs.getInt("id"));
                    lista.add(rs.getString("name"));
                    lista.add(rs.getInt("type_user"));
                    lista.add(rs.getString("username"));
                    return lista;
                }

            }
            
        }catch (SQLException e){
  
              System.out.println(e.toString());
            
        }
        return null;

    }
    
}

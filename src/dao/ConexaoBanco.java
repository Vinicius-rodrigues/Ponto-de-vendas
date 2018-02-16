package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vinicius
 */
public class ConexaoBanco {
    
    private Connection conexao;
    
    public Boolean conectar() {
               
        try {
            
            String url = "jdbc:sqlite:bancoSqlite/Pdv.db";
            this.conexao = DriverManager.getConnection(url);
        
        }catch(SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        
            
        return true;
    }
    
    public Boolean desconectar() {
        
        try{
            if(conexao.isClosed() == false) {
                this.conexao.close();
            }
        }catch(SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        return true; 
    }


    
}

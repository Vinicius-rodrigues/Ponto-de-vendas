package pdv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 *
 * @author vinicius
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Menu menuCadastro; 
    @FXML
    private MenuItem menuCadastrosCliente;
    @FXML
    private MenuItem menuCadastrosProdutos;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

}

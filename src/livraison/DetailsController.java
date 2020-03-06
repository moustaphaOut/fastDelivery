/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraison;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asmae
 */
public class DetailsController implements Initializable {

    @FXML
    private Label lb3;
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;
    @FXML
    private Label p1;
    @FXML
    private Label p2;
    @FXML
    private Label p4;
    @FXML
    private Label p3;
    @FXML
    private Label q4;
    @FXML
    private Label q3;
    @FXML
    private Label q2;
    @FXML
    private Label q1;
    @FXML
    private Button valider;
    @FXML
    private Button retour;
    @FXML
    private AnchorPane detailsPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handle(ActionEvent event) throws IOException {
        if (event.getSource() == valider) {
            JOptionPane.showMessageDialog(null, "Votre information a été validé");

        } else if (event.getSource() == retour) {
            Parent root = FXMLLoader.load(getClass().getResource("Choix.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) detailsPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }
    }

}

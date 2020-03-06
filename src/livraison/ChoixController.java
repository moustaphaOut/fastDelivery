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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asmae
 */
public class ChoixController implements Initializable {

    @FXML
    private AnchorPane choixPane;
    @FXML
    private Button restaurant;
    @FXML
    private Button retour;
    @FXML
    private Button objetOublie;
    @FXML
    private Button next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handle(ActionEvent event) throws IOException {
        if (event.getSource() == restaurant) {
            Parent root = FXMLLoader.load(getClass().getResource("Courses.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) choixPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else if (event.getSource() == objetOublie) {
            Parent root = FXMLLoader.load(getClass().getResource("Objet.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) choixPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } else if (event.getSource() == retour) {
            Parent root = FXMLLoader.load(getClass().getResource("Dilevery.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) choixPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } else if (event.getSource() == next) {
            Parent root = FXMLLoader.load(getClass().getResource("Details.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) choixPane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

    }

}

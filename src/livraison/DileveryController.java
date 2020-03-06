package livraison;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Asmae
 */
public class DileveryController implements Initializable {

    @FXML
    private Button login;

    HashMap mapAccounts = new HashMap();

    @FXML
    private ImageView log;

    @FXML
    private TextField user;
    @FXML
    private AnchorPane loginRootPane;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Label champLogin;
    @FXML
    private Label champPass;
    @FXML
    private Label errorLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("Data.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Livraison.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] arr = s.split("::");
            mapAccounts.put(arr[0], arr[1]);
        }

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (user.getText().trim().isEmpty()) {
            champLogin.setText("Champ Login obligatoire");
        } else {
            champLogin.setText("");
        }
        if (txtPass.getText().trim().isEmpty()) {
            champPass.setText("Champ Password obligatoire");
        } else {
            champPass.setText("");
        }
        if (!user.getText().trim().isEmpty() || !txtPass.getText().trim().isEmpty()) {

            if (txtPass.getText().equals(mapAccounts.get(user.getText()))) {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("Choix.fxml"));
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) loginRootPane.getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(DileveryController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                errorLogin.setText("Login ou Password incorrect");
            }
        }
    }

    @FXML
    private void handl(MouseEvent event) {
    }

}

/**
 * Sample Skeleton for 'UploadFileController.fxml' Controller Class
 */

package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UploadFileController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="uploadFileBtn"
    private Button uploadFileBtn; // Value injected by FXMLLoader

    @FXML
    void uploadFile(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert uploadFileBtn != null : "fx:id=\"uploadFileBtn\" was not injected: check your FXML file 'UploadFileController.fxml'.";

    }
}

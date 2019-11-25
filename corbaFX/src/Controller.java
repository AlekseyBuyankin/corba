import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import NotePadApp.*;

public class Controller implements Initializable {

    static NotePad notePadImpl;

    @FXML
    private Button addButton;

    @FXML
    private Button showButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextArea textField;

    @FXML
    private TextField deleteTextField;

    public void addEvent(ActionEvent event) {
        if (OrbClass.addNote(textField.getText())) {
            System.out.println("String added: \n" + textField.getText() + "\n");
        } else {
            System.out.println("Something went wrong :(");
        }
    }

    public void showEvent(ActionEvent event) {
        String string = OrbClass.showNotes();

        if (string != null) {
            textField.setText(string);
        } else {
            System.out.println("Something went wrong :(");
        }
    }

    public void deleteEvent(ActionEvent event) {
        if (!deleteTextField.getText().equals("")) {
            if (OrbClass.deleteNote(Integer.parseInt(deleteTextField.getText()))) {
                System.out.println("String " + deleteTextField.getText() + " deleted\n");

                deleteTextField.setText("");
            }
        } else {
            textField.setText("Enter the number of the line to be deleted");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        todo
    }
}

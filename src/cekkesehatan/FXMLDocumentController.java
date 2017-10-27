/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author DONY-SAMDHILA
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private JFXTextField Nama;
    @FXML
    private JFXTextField BB;
    @FXML
    private JFXTextField TB;
    @FXML
    private RadioButton Laki;
    @FXML
    private ToggleGroup PilihanJK;
    @FXML
    private RadioButton Perempuan;
    @FXML
    private JFXTextField Ideal;
    @FXML
    private JFXTextArea Hasil;
    @FXML
    private JFXTextArea Saran;
    @FXML
    private JFXButton Proses;
    @FXML
    private JFXButton Reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void OnProses(ActionEvent event) {
    String nama = Nama.getText();
    int tinggi = Integer.parseInt(TB.getText());
    int berat = Integer.parseInt(BB.getText());
    int ideal = 0;
    String sarann = null;
    
    if(Laki.isSelected()){
        ideal = tinggi - 100;
        if(ideal == berat){
            Ideal.setText(ideal+"");
            
            sarann = "Anda Ideal, pertahankan";
        }else if(ideal > berat){
            Ideal.setText(""+ideal);
            
            sarann = "Anda kurusan, gemukin yaa";
        }else if(ideal < berat){
            Ideal.setText(""+ideal);
            
            sarann = "Anda gemukan, diet yaa";
        }    
    }
    if(Perempuan.isSelected()){
        ideal = tinggi - 105;
        if(ideal == berat){
            Ideal.setText(""+ideal);
            
            sarann = "Anda Ideal, pertahankan";
        }else if(ideal > berat){
            Ideal.setText(""+ideal);
            
            sarann = "Anda kurusan, gemukin yaa";
        }else if(ideal < berat){
            Ideal.setText(""+ideal);
            
            sarann = "Anda gemukan, diet yaa";
        }    
    }
    Hasil.setText("Nama : "+nama+"\nBerat Badan : "+berat+"\nTinggi Badan : "+tinggi);
    Saran.setText(""+sarann);
    }

    @FXML
    private void OnReset(ActionEvent event) {
        Hasil.setText("");
        Saran.setText("");
        Nama.setText("");
        BB.setText("");
        TB.setText("");
        Ideal.setText("");
        Laki.setSelected(false);
        Perempuan.setSelected(false);
    }
    
}

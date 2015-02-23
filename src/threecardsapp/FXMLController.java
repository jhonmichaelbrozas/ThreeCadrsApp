
package threecardsapp;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FXMLController {

    @FXML
    private Label testo, percentuale, risultato;
    @FXML
    private Button btncarta1, btncarta2, btncarta3, start_continue;
    private String nomeCarta1, nomeCarta2, nomeCarta3;
    private int pVittorie = 0, pPerdite = 0, numPartita = 0;

    @FXML
    public void changeTxtButton() {
        start_continue.setText("Restart");
        btncarta1.setText("Carta 1");
        btncarta2.setText("Carta 2");
        btncarta3.setText("Carta 3");
    }

    public void setButtonDisable(boolean b) {
        btncarta1.setDisable(b);
        btncarta2.setDisable(b);
        btncarta3.setDisable(b);
    }

    public int calcolaPercentuale() {
        numPartita = pVittorie + pPerdite;
        int percentualeVinto = (pVittorie * 100) / numPartita;
        return percentualeVinto;
    }

    @FXML
    public void reset() {
        testo.setText("***TROVA L'ASSO***");
        changeTxtButton();
        setButtonDisable(false);
        Random random = new Random();
        int r = random.nextInt(3);
        if (r == 0) {
            nomeCarta1 = "Asso";
            nomeCarta2 = "Cavallo";
            nomeCarta3 = "Fante";
        }
        if (r == 1) {
            nomeCarta1 = "Fante";
            nomeCarta2 = "Asso";
            nomeCarta3 = "Cavallo";
        }
        if (r == 2) {
            nomeCarta1 = "Cavallo";
            nomeCarta2 = "Fante";
            nomeCarta3 = "Asso";
        }
    }

    @FXML
    public void f1() {
        if (nomeCarta1.equalsIgnoreCase("Asso")) {
            pVittorie++;
            risultato.setText("HAI VINTO!");
        } else {
            pPerdite++;
            risultato.setText("HAI PERSO! Hai scelto la carta: " + nomeCarta1);
        }
        btncarta1.setText(nomeCarta1);
        btncarta2.setText(nomeCarta2);
        btncarta3.setText(nomeCarta3);
        percentuale.setText("Vinte: " + pVittorie + "   " + " Perse: " + pPerdite + "   " + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
        
    }

    @FXML
    public void f2() {
        if (nomeCarta2.equalsIgnoreCase("Asso")) {
            pVittorie++;
            risultato.setText("HAI VINTO!");

        } else {
            pPerdite++;
            risultato.setText("HAI PERSO! Hai scelto la carta: " + nomeCarta2);
        }
        btncarta1.setText(nomeCarta1);
        btncarta2.setText(nomeCarta2);
        btncarta3.setText(nomeCarta3);
        percentuale.setText("Vinte: " + pVittorie + "   " +  " Perse: " + pPerdite + "   " + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    public void f3() {
        if (nomeCarta3.equalsIgnoreCase("Asso")) {
            pVittorie++;
            risultato.setText("HAI VINTO!");
        } else {
            pPerdite++;
            risultato.setText("HAI PERSO! Hai scelto la carta: " + nomeCarta3);
        }
        btncarta1.setText(nomeCarta1);
        btncarta2.setText(nomeCarta2);
        btncarta3.setText(nomeCarta3);
        percentuale.setText("Vinte: " + pVittorie + "   " + " Perse: " + pPerdite + "   " +  " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    
}

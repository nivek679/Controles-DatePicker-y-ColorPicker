package project.componentes;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class boton {

    private Button myButton;
    private colorPicker color;
    private datePicket fechaDate;

    public boton(Label labelaCambiar, Label fecha) {
        myButton = new Button("Guardar");
        //myButton.setPadding(new Insets(10));  ES PARA HACER MAS GRANDE EL NODO
        myButton.styleProperty().set("-fx-border-color: gray");
        
        myButton.setOnAction(event-> {
            System.out.println("Seleccionado con exito.");
            fecha.setText(fechaDate.obtenerFecha().toString());
            labelaCambiar.setStyle("-fx-background-color:" + color.obtenerColor().toString().replace("0x","#"));
        });

    }

    public Button geButton() {
        return myButton;
    }
}

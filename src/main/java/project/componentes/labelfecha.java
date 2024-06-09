package project.componentes;

import javafx.scene.control.Label;

public class labelfecha {
    private Label indicarLugarFecha;

    public labelfecha(){
        indicarLugarFecha = new Label("Seleccionar Fecha");

    }

    public Label getindicarLugarFechLabel(){
        return indicarLugarFecha;
    }
}

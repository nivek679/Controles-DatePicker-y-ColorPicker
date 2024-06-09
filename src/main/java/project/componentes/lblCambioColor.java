package project.componentes;

import javafx.scene.control.Label;

public class lblCambioColor {
    private Label lblColor;

    public lblCambioColor() {
        lblColor = new Label("                                              ");
        lblColor.styleProperty().set("-fx-border-color: black");
    }
    public Label getlblColor(){
        return lblColor;
    }
}


package project.componentes;

import javafx.scene.control.Label;

public class fchaEscojida {
    private Label f_escojida;

    public fchaEscojida(){
        f_escojida = new Label();
        f_escojida.styleProperty().set("-fx-border-color: gray");
    }

    public Label getF_escojida() {
        return f_escojida;
    }
    
}

package Creational.factory_method.src.factory;

import Creational.factory_method.src.buttons.Button;

public abstract class Dialog {
    
    abstract Button createButton();

    public void render(String closeDialog){
        Button okButton = createButton();
        okButton.render(closeDialog);
    }

}

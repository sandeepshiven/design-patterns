package Creational.factory_method.src.factory;

import Creational.factory_method.src.buttons.Button;
import Creational.factory_method.src.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
    
}

package Creational.factory_method.src.factory;

import Creational.factory_method.src.buttons.Button;
import Creational.factory_method.src.buttons.HTMLButton;

public class WebDialog extends Dialog{

    @Override
    Button createButton() {
       return new HTMLButton();
    }
    
}

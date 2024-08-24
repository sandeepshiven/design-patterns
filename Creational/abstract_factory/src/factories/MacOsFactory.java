package factories;

import buttons.Button;
import buttons.MacOsButton;
import checkBox.CheckBox;
import checkBox.MacOsCheckBox;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
    
}

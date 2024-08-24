package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkBox.CheckBox;
import checkBox.MacOsCheckBox;
import checkBox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
    
}

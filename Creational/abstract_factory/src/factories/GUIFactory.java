package factories;

import buttons.Button;
import checkBox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}

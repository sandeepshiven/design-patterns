import buttons.Button;
import checkBox.CheckBox;
import factories.GUIFactory;

public class App {
   

    Button button;
    CheckBox checkBox;

    public App(GUIFactory factory){
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void execute(){
        button.click();
        checkBox.check();
    }

}

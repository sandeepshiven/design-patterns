package Creational.factory_method.src.buttons;



public class HTMLButton implements Button{

    @Override
    public void onClick() {
        System.out.println("Clicked on HTML button");
    }

    @Override
    public void render(String closeDialog) {
        onClick();
        System.out.println("Web Dialog: " + closeDialog);
    }
    
}

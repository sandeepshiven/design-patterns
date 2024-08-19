package Creational.factory_method.src.buttons;





public class WindowsButton implements Button {

    @Override
    public void onClick() {
       System.out.println("Clicked on Windows button");
    }

    @Override
    public void render(String closeDialog) {
      onClick();
       System.out.println("Window Dialog: " + closeDialog);
    }
    
}

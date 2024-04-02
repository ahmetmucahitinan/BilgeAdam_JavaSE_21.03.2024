package week04.enums;

public class Test {

    Size pizzaSize;

    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza(){
        switch (pizzaSize){
            case SMALL:{
                System.out.println("I ordered small size pizza");
                break;
            }
            case MEDIUM: {
                System.out.println("I ordered medium size pizza");
                break;
            }
            case LARGE:{
                System.out.println("I ordered large size pizza");
                break;
            }
            case EXTRALARGE:{
                System.out.println("I ordered extralarge size pizza");
                break;
            }
            default:{
                System.out.println("I  don't know which size to order");
                break;
            }
        }
    }
}

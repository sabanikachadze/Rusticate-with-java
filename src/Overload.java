public class Overload {
public static void main(String[] args){
    System.out.println(bakePizza("10 w30","g11","HONDA original pads"));

}


static String fixCar(String oil){
    return oil + ". 33% ready";
}

static String bakePizza(String oil,String antiFreeze){

    return oil + " : " + antiFreeze + ". 66% ready";
}
static String bakePizza(String oil,String antiFreeze,String brakePads){

    return  oil + " : " + antiFreeze + " : " + brakePads + ". 99% ready";
}
}

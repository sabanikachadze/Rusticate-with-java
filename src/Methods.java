public class Methods {
    public static void main(String[] args){
        if(ageCheck(17)){
        System.out.println("You can't continue");
        }else{
        System.out.println("Continue");
        }
    }
    static void happyBirthday(){
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you");
        System.out.println("Happy Birthday to you \n");

    }
    static double square(double number){
    return number * number;
    }
    static double cube( double number){return number * number * number;}
    static String getFullName(String first, String last){ return first + " " + last;}
    static boolean ageCheck(int age){return age < 18;}
}

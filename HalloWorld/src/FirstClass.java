public class FirstClass {
    public static void main(String[] args) {

        isTooYoung(100);
    }
    public static boolean isTooYoung(int age){
        if (age < 18){
            System.out.println("you are too young");

            return true;
        }
        System.out.println("you are old");
        return false;
    }
}

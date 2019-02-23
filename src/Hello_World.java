public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Person p = new Person("Maciej");
        System.out.println("Witaj " + p.getName());

        try {
            showMeError();
            System.out.println("Access element in array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown   :" + e);
        }
    }

    private static void showMeError() {
        int num[] = {0, 1, 2, 3};
        System.out.println(num[128]);
    }
}

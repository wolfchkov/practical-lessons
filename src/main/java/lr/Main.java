package lr;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator pgen = new PasswordGenerator();
        System.out.println(pgen.generate(10));
        System.out.println(pgen.generate(8));
        System.out.println(pgen.generate(17));
        System.out.println(pgen.generate(20));
        System.out.println(pgen.generate(10));
        System.out.println(pgen.generate(8));
        System.out.println(pgen.generate(17));
        System.out.println(pgen.generate(20));

    }

}

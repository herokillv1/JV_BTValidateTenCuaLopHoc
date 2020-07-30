public class NameClassTest {
    private static NameClass nameClass;
    public static final String[] validNameClass = new String[] {"C0318G"};
    public static final String[] invalidNameClass = new String[] {"M0318G", "P0323A"};

    public static void main(String args[]) {
        nameClass = new NameClass();
        for (String email : validNameClass) {
            boolean isvalid = nameClass.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidNameClass) {
            boolean isvalid = nameClass.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}

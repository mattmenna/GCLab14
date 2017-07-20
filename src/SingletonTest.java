public class SingletonTest {
    public static void main(String[] args) {

        ProgramConfiguaration instance = ProgramConfiguaration.getInstance();


        instance.setConnectionLimit(10);
        System.out.println(instance.getConnectionLimit());
        instance.setPortNumber(80);
        System.out.println(instance.getPortNumber());
        instance.setTimeout(20);
        System.out.println(instance.getTimeout());
        instance.setURL("www.google.com");
        System.out.println(instance.getURL());

    }
}

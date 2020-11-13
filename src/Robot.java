public class Robot
{
    String name;

    Robot (String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Robot r = new Robot("Boi");
        r.speak("Hello! My name is ");
        Robot s = new Robot("Bob");
        s.speak("Wassup! My name is ");
    }

    void speak(String msg)
    {
        System.out.println(msg + name);
    }
}

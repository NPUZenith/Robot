public class Robot
{
    String name;

    public static void main(String[] args)
    {
        Robot r = new Robot();
        r.name = "Boi";
        r.speak("Hello! My name is ");
    }

    void speak(String msg)
    {
        System.out.println(msg + name);
    }
}

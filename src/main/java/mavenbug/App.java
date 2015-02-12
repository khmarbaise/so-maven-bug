package mavenbug;

public class App
{

    public static class BaseData
    {
    }

    public static class DerivedData
        extends BaseData
    {
    }

    public void method( DerivedData data )
    {
        System.out.println( "hello2 " + data.getClass().toString() );
    }
}

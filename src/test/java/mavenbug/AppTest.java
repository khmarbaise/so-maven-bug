package mavenbug;

import mavenbug.App.DerivedData;

import org.junit.Test;

public class AppTest
{

    @Test
    public void test()
    {
        new App().method( new DerivedData() );
    }
}


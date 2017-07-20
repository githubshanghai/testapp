package com.example.add.test;
import android.test.ActivityInstrumentationTestCase2;
import com.example.add.MainActivity;
import com.robotium.solo.Solo;

/**
 * Created by kaka on 2017-07-06 0006.
 */

public class Calculate16test extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;
    public Calculate16test() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());
    }

    public void testCalc16(){
        solo.enterText(0,"100");
        solo.enterText(1,"2");
        solo.sleep(2000);
        solo.clickOnView(solo.getView("com.example.add:id/btn1"));
        solo.sleep(2000);
        solo.clickOnView(solo.getView("com.example.add:id/btn2"));
        solo.sleep(2000);
        solo.clickOnView(solo.getView("com.example.add:id/btn3"));
        solo.sleep(2000);
        solo.clickOnView(solo.getView("com.example.add:id/btn4"));
        solo.sleep(2000);

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();;
        super.tearDown();
    }


}

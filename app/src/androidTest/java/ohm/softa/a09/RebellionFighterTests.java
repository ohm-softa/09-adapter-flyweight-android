package ohm.softa.a09;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;

import ohm.softa.a09.model.Fighter;
import ohm.softa.a09.model.NameGenerator;
import ohm.softa.a09.model.rebellion.AWing;
import ohm.softa.a09.model.rebellion.XWing;
import ohm.softa.a09.model.rebellion.YWing;

import static junit.framework.Assert.assertNotNull;

/**
 * @author Peter Kurfer
 */

public class RebellionFighterTests {

    private NameGenerator nameGenerator;

    @Test
    public void testCreateAWing(){
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        nameGenerator = new NameGenerator(appContext);

        Bitmap awingBitmap = BitmapFactory.decodeResource(appContext.getResources(), R.drawable.awing);
        Drawable awingImage = new BitmapDrawable(appContext.getResources(), awingBitmap);
        assertNotNull(awingImage);

        Fighter aWing = new AWing(nameGenerator.generateName(), awingImage);
        assertNotNull(aWing);
    }

    @Test
    public void testCreateXWing(){
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        nameGenerator = new NameGenerator(appContext);

        Bitmap xWingBitmap = BitmapFactory.decodeResource(appContext.getResources(), R.drawable.xwing);
        Drawable xWingImage = new BitmapDrawable(appContext.getResources(), xWingBitmap);
        assertNotNull(xWingImage);

        Fighter xWing = new XWing(nameGenerator.generateName(), xWingImage);
        assertNotNull(xWing);
    }

    @Test
    public void testCreateYWing(){
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        nameGenerator = new NameGenerator(appContext);

        Bitmap yWingBitmap = BitmapFactory.decodeResource(appContext.getResources(), R.drawable.ywing);
        Drawable yWingImage = new BitmapDrawable(appContext.getResources(), yWingBitmap);
        assertNotNull(yWingImage);

        Fighter yWing = new YWing(nameGenerator.generateName(), yWingImage);
        assertNotNull(yWing);
    }

}

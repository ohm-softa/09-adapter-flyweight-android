package ohm.softa.a09;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import ohm.softa.a09.model.NameGenerator;

import static ohm.softa.a09.TestConstants.LOGGING_TAG;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class NameGeneratorTests {

    @Test
    public void testGenerateRandomName() throws Exception {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        NameGenerator nameGenerator = new NameGenerator(appContext);
        String generatedName = nameGenerator.generateName();

        assertNotNull(generatedName);
        assertNotEquals(0, generatedName.length());
        Log.d(LOGGING_TAG, String.format("Generated name: %s", generatedName));    }
}

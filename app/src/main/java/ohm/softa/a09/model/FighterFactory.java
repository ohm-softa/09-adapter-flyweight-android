package ohm.softa.a09.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.util.HashMap;
import java.util.Random;

import ohm.softa.a09.R;
import ohm.softa.a09.model.empire.TieBomber;
import ohm.softa.a09.model.empire.TieFighter;
import ohm.softa.a09.model.empire.TieInterceptor;
import ohm.softa.a09.model.rebellion.AWing;
import ohm.softa.a09.model.rebellion.XWing;
import ohm.softa.a09.model.rebellion.YWing;

/**
 * @author Peter Kurfer
 */

public class FighterFactory {

    private final Random random;
    private final Context context;
    private final NameGenerator nameGenerator;

    public FighterFactory(Context context) {
        this.context = context;
        nameGenerator = new NameGenerator(context);
        random = new Random();
    }

    public Fighter createFighter() {
        switch (random.nextInt(6)) {
            case 0:
                return new AWing(nameGenerator.generateName(), loadImage(R.drawable.awing));
            case 1:
                return new XWing(nameGenerator.generateName(), loadImage(R.drawable.xwing));
            case 2:
                return new YWing(nameGenerator.generateName(), loadImage(R.drawable.ywing));
            case 3:
                return new TieBomber(nameGenerator.generateName(), loadImage(R.drawable.tiebomber));
            case 4:
                return new TieFighter(nameGenerator.generateName(), loadImage(R.drawable.tiefighter));
            default:
                return new TieInterceptor(nameGenerator.generateName(), loadImage(R.drawable.tieinterceptor));
        }
    }

    private HashMap<Integer, Bitmap> cache = new HashMap<>();

    private Drawable loadImage(int imageId) {
        if (!cache.containsKey(imageId)) {
            Bitmap bm = BitmapFactory.decodeResource(context.getResources(), imageId);
            cache.put(imageId, bm);
            return new BitmapDrawable(context.getResources(), bm);
        }

        return new BitmapDrawable(context.getResources(), cache.get(imageId));
    }
}

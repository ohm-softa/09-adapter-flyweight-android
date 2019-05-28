package ohm.softa.a09.model.rebellion;

import android.graphics.drawable.Drawable;

import ohm.softa.a09.model.Fighter;

/**
 * @author Peter Kurfer
 */

public class YWing extends Fighter {

    public YWing(String pilot, Drawable fighterImage) {
        super(pilot, fighterImage);
    }

    @Override
    public String getFighterType() {
        return "Y-wing";
    }
}

package ohm.softa.a09.model.rebellion;

import android.graphics.drawable.Drawable;

import ohm.softa.a09.model.Fighter;

/**
 * @author Peter Kurfer
 */

public class AWing extends Fighter {

    public AWing(String pilot, Drawable fighterImage) {
        super(pilot, fighterImage);
    }

    @Override
    public String getFighterType() {
        return "A-wing";
    }
}

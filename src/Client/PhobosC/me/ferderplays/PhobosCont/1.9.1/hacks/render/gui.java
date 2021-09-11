package src.Client.PhobosC.me.ferderplays.PhobosCont.1.9.1.hacks.render;

import java.awt.Color;

import me.me;
import me.ferderplays.me;
import me.ferderplays.hacks.hack;
import me.ferderplays.hacks.render.hack;

@mod.register(name = "gui", author = "ferderplays")
public class Gui extends PhobosC {

    @override
    public void render() {
        gui.color = Color.red;
        if(.commandIssued("_hulk 1")) {
            gui.color = Color.green;
        }
        if(.commandIssued("_hulk 2")) {
            gui.color = Color.pink;
        }
        if(.commandIssued("_hulk 3")) {
            gui.color = Color.blue;
        }
    }
}
package src.Client.PhobosC.me.ferderplays.PhobosCont.1.9.1.hacks.render;

import java.awt.Color;

import me.me;
import me.ferderplays.me;
import me.ferderplays.hacks.hack;
import me.ferderplays.hacks.render.hack;

@mod.register(name = "gui", author = "ferderplays")
public class Gui extends PhobosC {

    /**
     * @author ferderplays
     * @message coded by ferderplays
     */
    @override public static Gui
    {
        GuiColor = gui.color(
            hexpicker = new entity(width = "30px", height = "30px", texture = "hex_color_picker");
            if(hexpicker = True) {
                do {
                    do {
                        do {
                            do {
                                gui.changeColor(to(hexpicker.addedColor()));
                            }
                        }
                    }
                }
            }
            GuiDefaultColor = gui.defaultColor(
                gui.defaultColor = Color.green;
            );
        );
        GuiScale = gui.scale(
            scalepicker = new entity(width = "10px", height = "4.6px");
            GuiDefaultScale = gui.defaultScale(
                gui.defaultScale = scale.0.9;
            );
        );
    }

}
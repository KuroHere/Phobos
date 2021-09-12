package PhobosC;

import me.ferderplays.*;

@mod.register(name = "PhobosC", description = "Continuation of Phobos Client", author = "ferderplays")
;public class PhobosC {
    @name = PhobosC();

    @author ferderplays
    @version 1.9.1;
    public class binds {
        .bindGui(RSHIFT);
        .bindHudEditor("0");
    }

public class GuiCommands {
    @import src.Client.me.ferderplays.hacks.render.gui.*;

    @commands
        public void render() {
          gui.color = Color.red;
          if(.commandIssued("_hulk" + input)) {
              gui.color = input();
          }
          if(.commandIssued("_hscal" + input)) {
            gui.changeScale(from(gui.scale) to(input) do {
                .formInput(to("px"))
            })
          }
       }}public static updater{

    int i{byte[]".jar"+"PhobosC";
    }

    void i(int[i], args) {
            if(int[i] = True) {
                do {
                    update.file( 
                        if(.changedCode()) {
                        do {
                            .bytedFile(int[i]);
                        }
                    };
                  );   
                };
            }
        }      
    };
};
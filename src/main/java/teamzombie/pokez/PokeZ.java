package teamzombie.pokez;

import teamzombie.pokez.setup.Registration;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokeZ.MODID)
public class PokeZ {
	
    public static final String MODID = "pokez";

    public PokeZ() {
    	
    	// Registration for items, blocks and entities
    	Registration.init();
		
    }
}

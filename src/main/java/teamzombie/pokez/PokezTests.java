package teamzombie.pokez;

import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.gametest.GameTestHolder;
import teamzombie.pokez.setup.Registration;

@GameTestHolder("pokez")

public class PokezTests {

    private static final String MODID = "pokez";

	/**
     * @param event The game event tests will auto-register when run in the GameServerTestMode.
     */
    @SubscribeEvent
    public void onRegisterGameTests(RegisterGameTestsEvent event) {
        event.register(this.getClass());
    }

    /**
     * @param helper Provided by the game register event.
     */
    @GameTest(templateNamespace = MODID, template = "empty3x3x3")
    public static void pokeBlueBlockTest(GameTestHelper helper) {
        BlockPos pokezBlock = new BlockPos(1, 1, 1);

        //Register the Blue Pokeball Ore then test if it was created.
        helper.setBlock(pokezBlock, Registration.Blue_Pokeball_Ore_Block.get());
        helper.assertBlockState(pokezBlock, b->b.is(Registration.Blue_Pokeball_Ore_Block.get()), ()-> "Blue_Pokeball_Ore_Block not present!");

        helper.succeed();
    }

    @GameTest(templateNamespace = MODID, template = "empty3x3x3")
    public static void pokeRedBlockTest(GameTestHelper helper) {
        BlockPos pokezBlock = new BlockPos(1, 1, 1);

        //Register the Red Pokeball Ore then test if it was created.
        helper.setBlock(pokezBlock, Registration.Red_Pokeball_Ore_Block.get());
        helper.assertBlockState(pokezBlock, b->b.is(Registration.Red_Pokeball_Ore_Block.get()), ()-> "Red_Pokeball_Ore_Block not present!");

        helper.succeed();
    }

    @GameTest(templateNamespace = MODID, template = "empty3x3x3")
    public static void pokeGreenBlockTest(GameTestHelper helper) {
        BlockPos pokezBlock = new BlockPos(1, 1, 1);

        //Register the Green Pokeball Ore then test if it was created.
        helper.setBlock(pokezBlock, Registration.Green_Pokeball_Ore_Block.get());
        helper.assertBlockState(pokezBlock, b->b.is(Registration.Green_Pokeball_Ore_Block.get()), ()-> "Green_Pokeball_Ore_Block not present!");

        helper.succeed();
    }

}    
    
    

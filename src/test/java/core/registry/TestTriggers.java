package core.registry;

import com.minecraftabnormals.abnormals_core.common.advancement.EmptyTrigger;
import com.minecraftabnormals.abnormals_core.core.annotations.Test;
import core.ACTest;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Test
@Mod.EventBusSubscriber(modid = ACTest.MOD_ID)
public final class TestTriggers {
	public static final EmptyTrigger EMPTY_TEST = CriteriaTriggers.register(new EmptyTrigger(prefix("empty_test")));

	private static ResourceLocation prefix(String name) {
		return new ResourceLocation(ACTest.MOD_ID, name);
	}
}

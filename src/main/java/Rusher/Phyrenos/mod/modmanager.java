package Rusher.Phyrenos.mod;

import Rusher.Phyrenos.mod.impl.ChristmasChests;
import Rusher.Phyrenos.mod.impl.FastLadder;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;

public class modmanager extends ToggleableModule {
    final BooleanSetting fastladder = new BooleanSetting("FastLadder", false);
    final NumberSetting<Float> Speed = new NumberSetting<Float>("Speed", 0.1f, 0.1f, 1f);

    final BooleanSetting Christmaschests = new BooleanSetting("ChristmasChests", false);
    public modmanager() {
        super("PhyrenosMods", "All the Modules", ModuleCategory.CLIENT);

        fastladder.addSubSettings(Speed);
        registerSettings(fastladder, Christmaschests);

    }


    @Subscribe
    private void onUpdate(EventUpdate event) throws NoSuchFieldException, IllegalAccessException {
        if(Christmaschests.getValue()){
            ChristmasChests.christmaschests();
        }
        if(fastladder.getValue()){
            FastLadder.SppedLadder(Speed.getValue());
        }
    }
}

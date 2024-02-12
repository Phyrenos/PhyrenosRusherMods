package Rusher.Phyrenos;

import Rusher.Phyrenos.mod.modmanager;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

/**
 * Example rusherhack plugin
 *
 * @author John200410
 */
public class PhyrenosUtils extends Plugin {
	
	@Override
	public void onLoad() {

		final modmanager modmanage = new modmanager();
		RusherHackAPI.getModuleManager().registerFeature(modmanage);
	}
	
	@Override
	public void onUnload() {
		this.getLogger().info("Example plugin unloaded!");
	}
	
}
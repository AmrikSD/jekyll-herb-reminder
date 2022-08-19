package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import xyz.amrik.JekyllHerbReminderPlugin;

public class ExamplePluginTest {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(JekyllHerbReminderPlugin.class);
		RuneLite.main(args);
	}
}
package com.autoevents;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
        name = "AutoEvents"
)
public class AutoEventsPlugin extends Plugin
{
    @Inject
    private Client client;

    @Inject
    private AutoEventsConfig config;

    @Override
    protected void startUp() throws Exception
    {
        log.info("Example started!");
    }

    @Override
    protected void shutDown() throws Exception
    {
        log.info("Example stopped!");
    }

    @Provides
    AutoEventsConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(AutoEventsConfig.class);
    }

    @Subscribe
    public void onNpcLootReceived(final NpcLootReceived npcLootReceived) {
        log.info(npcLootReceived.toString());
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event)
    {

    }
}

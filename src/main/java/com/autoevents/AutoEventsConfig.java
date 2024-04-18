package com.autoevents;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(AutoEventsConfig.GROUP)
public interface AutoEventsConfig extends Config
{
    String GROUP = "autoevents";

    @ConfigItem(
            position = 0,
            keyName = "useOSRSEvents",
            name = "Use OSRSEvents",
            description = "Whether to use the OSRSEvents.com or a custom API Url"
    )

    default boolean useOSRSEvents() { return true; }

    @ConfigItem(
            position = 1,
            keyName = "customAPIUrl",
            name = "Custom API Url",
            description = "Custom API Url that supports the plugin"
    )

    default String customAPIUrl() { return ""; }

}

package com.autoevents;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AutoEventsTest
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(AutoEventsPlugin.class);
        RuneLite.main(args);
    }
}
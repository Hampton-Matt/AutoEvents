package com.autoevents.models;

import lombok.Value;
import net.runelite.http.api.loottracker.LootRecordType;

@Value
class Loot {

    private final int itemId;
    private final int bossId;
    private final String rsn;
    private final int eventId;

}

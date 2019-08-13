package net.monkeymines.mod;

import java.util.Map;

import net.minecraft.entity.ai.brain.MemoryModuleState;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.ai.brain.task.Task;
import net.minecraft.entity.passive.VillagerEntity;

public class VoodooTask extends Task<VillagerEntity> {

    public VoodooTask(Map<MemoryModuleType<?>, MemoryModuleState> map_1) {
        super(map_1);
    }
    
}
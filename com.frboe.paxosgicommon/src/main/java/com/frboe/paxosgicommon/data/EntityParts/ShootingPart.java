/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frboe.paxosgicommon.data.EntityParts;

import com.frboe.paxosgicommon.data.Entity;
import com.frboe.paxosgicommon.data.GameData;

/**
 *
 * @author Bruger
 */
public class ShootingPart implements EntityPart{

    boolean shooting = false;
    boolean cooldown = false;
    
    @Override
    public void process(GameData gameData, Entity entity) {
    }
    
    public boolean isRecharching(){
        return cooldown;
    }
    public void setIsRecharching(boolean cooldown){
        this.cooldown = cooldown;
    }
    public boolean isShooting(){
        return shooting;
    }
    
    public void setIsShooting(boolean shooting){
        this.shooting = shooting;
    }
    
    
}

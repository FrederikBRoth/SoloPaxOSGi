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
 * @author Federico
 */
public interface EntityPart {

    void process(GameData gameData, Entity entity);
}

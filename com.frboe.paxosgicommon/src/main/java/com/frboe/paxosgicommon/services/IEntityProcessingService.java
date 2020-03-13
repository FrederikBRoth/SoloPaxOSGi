package com.frboe.paxosgicommon.services;

import com.frboe.paxosgicommon.data.GameData;
import com.frboe.paxosgicommon.data.World;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico
 */
public interface IEntityProcessingService {
    void process(GameData gameData, World world);
}

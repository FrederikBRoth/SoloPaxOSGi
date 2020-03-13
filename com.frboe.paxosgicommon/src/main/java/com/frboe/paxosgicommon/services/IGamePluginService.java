/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frboe.paxosgicommon.services;

import com.frboe.paxosgicommon.data.GameData;
import com.frboe.paxosgicommon.data.World;

/**
 *
 * @author Federico
 */
public interface IGamePluginService {
    void start(GameData gameData, World world);

    void stop(GameData gameData, World world);
}

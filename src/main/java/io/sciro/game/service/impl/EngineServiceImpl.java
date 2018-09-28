package io.sciro.game.service.impl;

import io.sciro.game.enums.HandSignal;
import io.sciro.game.service.EngineService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * PROJECT   : game
 * PACKAGE   : io.sciro.game.service.impl
 * USER      : sean
 * DATE      : 18-Tue-Sep-2018
 * TIME      : 23:14
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@Service
public class EngineServiceImpl implements EngineService {

    @Override
    public HandSignal pcMove() {
        Random rnd = new Random();
        return HandSignal.values()[rnd.nextInt(HandSignal.values().length)];
    }
}

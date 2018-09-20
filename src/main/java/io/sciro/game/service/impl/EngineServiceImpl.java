package io.sciro.game.service.impl;

import io.sciro.game.enums.HandSignal;
import io.sciro.game.service.EngineService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public String pcMove() {
        List<HandSignal> handSignals = Arrays.asList(HandSignal.values());
        Collections.shuffle(handSignals);

        return handSignals.stream().findFirst().get().getSignal();
    }
}

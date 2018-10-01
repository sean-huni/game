package io.sciro.game.controller;

import io.sciro.game.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PROJECT   : game
 * PACKAGE   : io.sciro.game.controller
 * USER      : sean
 * DATE      : 18-Tue-Sep-2018
 * TIME      : 23:13
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@RestController
@RequestMapping("/game-engine")
public class GameEngineCtrl {
    private final EngineService engineService;

    @Autowired
    public GameEngineCtrl(final EngineService engineService) {
        this.engineService = engineService;
    }

    @GetMapping("/pc-move")
    public String pcMove() {
        return engineService.pcMove().toString();
    }
}

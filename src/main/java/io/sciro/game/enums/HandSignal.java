package io.sciro.game.enums;

/**
 * PROJECT   : sciroc
 * PACKAGE   : io.game.sciro.enums
 * USER      : sean
 * DATE      : 16-Sun-Sep-2018
 * TIME      : 21:18
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
public enum HandSignal {
    ROC("ROCK"),
    PAP("PAPER"),
    SCI("SCISSORS");

    private String signal;

    HandSignal(String signal) {
        this.signal = signal;
    }

    public String getSignal() {
        return signal;
    }
}

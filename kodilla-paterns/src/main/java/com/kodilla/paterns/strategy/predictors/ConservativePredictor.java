package com.kodilla.paterns.strategy.predictors;

import com.kodilla.paterns.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}

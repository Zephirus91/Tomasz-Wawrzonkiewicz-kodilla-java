package com.kodilla.paterns.strategy.predictors;

import com.kodilla.paterns.strategy.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}

package PresenterTest;

import it.unimi.di.sweng.esame.presenter.DisplayPresenter;
import it.unimi.di.sweng.esame.view.DisplayView;
import it.unimi.di.sweng.esame.view.OutputView;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.*;

public class Presentert {

    @ParameterizedTest
    @ValueSource(strings = {"BY DATE", "BY CRITICALITY", "NEXT FORECAST FOR EACH LOCATION"})
    public void defaultTest(String input){
        OutputView viewOutput = Mockito.mock(DisplayView.class);
        DisplayPresenter SUT = new DisplayPresenter(viewOutput, input);
        Mockito.verify(viewOutput, Mockito.times(3) ).set(0, "");

    }

}

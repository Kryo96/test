package it.unimi.di.sweng.esame.presenter;

import it.unimi.di.sweng.esame.Model.Model;
import it.unimi.di.sweng.esame.Observer.Observer;
import it.unimi.di.sweng.esame.view.OutputView;
import org.jetbrains.annotations.NotNull;


public class DisplayPresenter implements Observer {
    private final OutputView viewOutpu;

    private final Model model;

    public DisplayPresenter(@NotNull OutputView viewOutpu, @NotNull String type, Model model) {

        this.viewOutpu = viewOutpu;
        this.model = model;

    }


    @Override
    public void update() {
        viewOutpu.set(0, "");
    }
}

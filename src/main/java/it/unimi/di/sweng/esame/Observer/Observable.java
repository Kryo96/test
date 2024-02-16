package it.unimi.di.sweng.esame.Observer;

import it.unimi.di.sweng.esame.Model.MeteoNews;
import org.jetbrains.annotations.NotNull;

public interface Observable {

    void AddObserver(@NotNull Observer obs);

    void notifyObservers();

    @NotNull MeteoNews[] getNews();
}

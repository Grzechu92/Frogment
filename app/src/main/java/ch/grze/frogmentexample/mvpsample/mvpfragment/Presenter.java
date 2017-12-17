package ch.grze.frogmentexample.mvpsample.mvpfragment;

import ch.grze.frogmentmvp.presenter.AbstractMvpPresenter;

public class Presenter extends AbstractMvpPresenter<Contract.View> implements Contract.Presenter {
    @Override
    public void onAttach(Contract.View view) {
        setView(view);

        getView().setStatus("Not clicked!");
    }

    @Override
    public void onDetach() {

    }

    @Override
    public void onButtonClicked() {
        getView().setStatus("Clicked!");
    }
}

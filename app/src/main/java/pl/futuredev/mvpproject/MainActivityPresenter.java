package pl.futuredev.mvpproject;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private MainActivityContract.Model model;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        model = new UserDataManager();
    }

    @Override
    public void loadUserName() {
        view.showUserName(model.getUserName());
    }

    @Override
    public void submitName(String firstName, String surName) {
        model.setDetails(firstName, surName);
    }
}

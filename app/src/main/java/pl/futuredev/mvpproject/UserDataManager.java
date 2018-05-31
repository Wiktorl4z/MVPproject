package pl.futuredev.mvpproject;

public class UserDataManager implements MainActivityContract.Model {

    private User user;

    public UserDataManager() {
    }

    @Override
    public void setDetails(String firstName, String surName) {
        user = new User(firstName, surName);
    }

    @Override
    public String getUserName() {
        return "Welcome "+user.getFirstName()+" "+user.getSurName();
    }
}

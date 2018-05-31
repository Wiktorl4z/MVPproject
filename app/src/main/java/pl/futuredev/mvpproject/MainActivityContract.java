package pl.futuredev.mvpproject;

public interface MainActivityContract {

    interface View {
        void showUserName(String username);
    }

    interface Model {
        void setDetails(String firstName, String surname);
        String getUserName();
    }

    interface Presenter {
        void loadUserName();
        void submitName(String firstName, String surname);
    }
}

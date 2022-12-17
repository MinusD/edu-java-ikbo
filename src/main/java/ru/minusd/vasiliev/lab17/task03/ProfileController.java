package ru.minusd.vasiliev.lab17.task03;

public class ProfileController {
    private ProfileModel model;
    private ProfileViewGUI view;

    public ProfileController(ProfileModel model, ProfileViewGUI view) {
        this.model = model;
        this.view = view;
    }

    public void setProfileName(String name) {
        model.setName(name);
    }

    public String getProfileName() {
        return model.getName();
    }

    public void setProfileSurname(String surname) {
        model.setSurname(surname);
    }

    public String getProfileSurname() {
        return model.getSurname();
    }

    public void setProfileEmail(String email) {
        model.setEmail(email);
    }

    public String getProfileEmail() {
        return model.getEmail();
    }

    public void setProfilePhone(String phone) {
        model.setPhone(phone);
    }

    public String getProfilePhone() {
        return model.getPhone();
    }

    public void updateView() {
        view.updateView(model.getName(), model.getSurname(), model.getEmail(), model.getPhone());
    }
}

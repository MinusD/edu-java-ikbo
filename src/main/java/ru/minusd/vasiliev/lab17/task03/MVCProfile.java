package ru.minusd.vasiliev.lab17.task03;

public class MVCProfile {
    public static void main(String[] args) {
        ProfileModel model = new ProfileModel();
        ProfileViewGUI view = new ProfileViewGUI();
        ProfileController controller = new ProfileController(model, view);
        controller.updateView();
        controller.setProfileName("Amogus");
        controller.setProfileSurname("Sus");
        controller.setProfileEmail("@@@@@@@ඞඞඞඞඞඞ.ru");
        controller.setProfilePhone("1234567890");
        controller.updateView();
    }
}

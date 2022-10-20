package a.a.a.c.g;

public enum MainForm {
    LOGIN("login.fxml"),
    MAIN("main.fxml"),
    REGISTER("register.fxml");

    private final String HBF;

    MainForm(String var3) {
        this.HBF = var3;
    }

    public String getFxmlFileName() {
        return this.HBF;
    }
}

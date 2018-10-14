package snappet.test.model;


public enum navMenu {
    Logo("logo"),
    Home("home"),
    Lessons("lessons"),
    WorkingSets("workingset"),
    Monitor("monitor"),
    Reports("reports")    ;

    navMenu(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }
}

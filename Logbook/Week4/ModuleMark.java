package Logbook.Week4;

public class ModuleMark {
    private final Module module;
    private final int mark;

    public ModuleMark(Module module, int mark) {
        this.module = module;
        this.mark = mark;
    }

    public Module getModule() {
        return module;
    }

    public int getMark() {
        return mark;
    }

    public void print() {
        System.out.println(module.getModuleCode() + " - " + module.getModuleName() + ": " +
                mark + " (" + module.convertMarkToGrade(mark) + ")");
    }
}

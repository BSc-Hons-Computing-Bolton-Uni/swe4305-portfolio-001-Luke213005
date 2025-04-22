package ProjectB;

public class Module {
    private final String moduleCode;
    private final String moduleName;
    private final boolean isCore;

    public Module(String moduleCode, String moduleName, boolean isCore) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.isCore = isCore;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    @Override
    public String toString() {
        return moduleCode + ": " + moduleName + (isCore ? " (Core)" : " (Optional)");
    }
}
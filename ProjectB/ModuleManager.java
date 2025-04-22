package ProjectB;

import java.util.*;

public class ModuleManager {
    private final Map<String, Module> modules = new HashMap<>();

    public ModuleManager() {
        initializeModules();
    }

    private void initializeModules() {
        addModule("CFT3301", "Fundamentals Of Programming", true);
        addModule("CFT3302", "Logical Analysis and Problem Solving", true);
        addModule("CTF3303", "Computer Systems", true);
        addModule("CFT3304", "Foundation Project", true);
        addModule("COM4301", "Maths for Computing", true);
        addModule("COM4302", "Computer Science Fundamentals", true);
        addModule("SWE4303", "Computer Infrastructure", true);
        addModule("SWE4304", "Databases", true);
        addModule("SWE4305", "Object Oriented Programming", true);
        addModule("SWE5306", "Systems Analysis and Design", true);
        addModule("SWE5307", "Web Design and Programming", true);
        addModule("SWE5308", "Cloud Technology", true);
        addModule("SWE5304", "Advanced Databases and Big Data", false);
        addModule("AIN5301", "Introduction to AI", false);
        addModule("COM5300", "Research and Professional Issues", true);
        addModule("COM5301", "Undergraduate Project", true);
        addModule("SWE6304", "Emerging Technologies", true);
        addModule("SWE6302", "Applied Machine Learning", false);
        addModule("SWE6303", "Software Quality Management", false);
        addModule("SEC6302", "Information Security Management", false);
        addModule("SEC6305", "Operations Management", false);
        addModule("AIN6301", "Natural Language Processing", false);
    }

    public void addModule(String code, String name, boolean isCore) {
        modules.put(code, new Module(code, name, isCore));
    }

    public Module getModule(String code) {
        return modules.get(code);
    }

    public void displayModules() {
        for (Module module : modules.values()) {
            System.out.println(module);
        }
    }
}
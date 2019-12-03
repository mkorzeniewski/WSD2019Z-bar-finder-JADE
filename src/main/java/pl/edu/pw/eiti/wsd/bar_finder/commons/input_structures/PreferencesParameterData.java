package pl.edu.pw.eiti.wsd.bar_finder.commons.input_structures;

public class PreferencesParameterData {

    private String name;
    private Object value;
    private double importance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    public double getImportance() {
        return importance;
    }
    public void setImportance(double importance) {
        this.importance = importance;
    }

    public PreferencesParameterData()
    {}

    public PreferencesParameterData(String name, Object value, double importance)
    {
        setName(name);
        setValue(value);
        setImportance(importance);
    }
}

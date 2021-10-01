package modelsortable;

import java.util.ArrayList;
import java.util.List;

public class School {

    private long id;
    private String name;
    private String description;

    private List<Class> classes = new ArrayList<>();
    private String Schooltype;
    private List<String> staffs = new ArrayList<>();
    private Address address;
    private List<Student> students = new ArrayList<>();
}

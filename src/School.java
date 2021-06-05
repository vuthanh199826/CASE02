import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Class> classes;

    public School() {
        classes = new ArrayList<>();
    }

    public void add(Class newClass) {
        classes.add(newClass);
        System.out.println("Add successfully!");
    }

    public void edit(int index, String name) {
        for (Class element : classes) {
            if (classes.indexOf(element) == index) {
                element.setName(name);
            }
        }
    }

    public void edit(int indexOfClass, Student student) {
        for (Class element : classes) {
            if (classes.indexOf(element) == indexOfClass) {
                element.add(student);
            }
        }
    }

    public void edit(int indexOfClass,int indexOfStudent, Student newStudent) {
        for (Class element : classes) {
            if (classes.indexOf(element) == indexOfClass) {
                element.edit(indexOfStudent,newStudent);
            }
        }
    }


    public int findClass(String name) {
        for (Class element : classes) {
            if (element.getName().equals(name)) {
                return classes.indexOf(element);
            }
        }
        return -1;
    }


}

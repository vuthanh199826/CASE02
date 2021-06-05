import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class {
    private List<Student> students;
    private String name;

    public Class(String name) {
        students = new ArrayList<>();
        this.name = name;
    }

    public List<Student> getStudents(){
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Student student){
        students.add(student);
    }

    public void edit(int index, Student newStuden){
        for (Student student: students){
            if(students.indexOf(student)==index){
                student.setCode(newStuden.getCode());
                student.setName(newStuden.getName());
                student.setDob(newStuden.getDob());
                student.setGender(newStuden.isGender());
                student.setAddress(newStuden.getAddress());
                student.setGpa(newStuden.getGpa());
            }
        }
    }

    public void delete(int index){
        students.remove(index);
    }


    public List<Student> search(List<Integer> index){
        List<Student> list = new ArrayList<>();
        for (Integer element: index){
            for (Student student:students){
                if(students.indexOf(student)==element){
                    list.add(student);
                    break;
                }
            }
        }
        return list;
    }

    public List<Integer> findIndex(String name){
        List<Integer> list = new ArrayList<>();
        for (Student student:students){
            if(student.getName().equals(name)){
                list.add(students.indexOf(student));
            }
        }
        return list;
    }
    public int findStudent(String code){
        for (Student student:students){
            if(student.getCode().equals(code)){
                return students.indexOf(student);
            }
        }
        return -1;
    }

    public void sort(int option){
        switch (option){
            case 1:
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getCode().compareTo(o2.getCode());
                    }
                });
            case 2:
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
            case 3:
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if(o1.getGpa() > o2.getGpa()){
                            return -1;
                        }else if (o1.getGpa() < o2.getGpa()){
                            return 1;
                        }else if(o1.getGpa() == o2.getGpa()){
                            return o1.getCode().compareTo(o2.getCode());
                        }else {
                            return 0;
                        }
                    }
                });
        }
    }

    public void display(){
        for (Student student:students){
            System.out.println(student);
        }
    }


}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        int choice;
        while (true){
            System.out.println("Nhap lua chon");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhập tên lớp mới vào đây");
                    String name = sc.nextLine();
                    Class newClass = new Class(name);
                    school.add(newClass);
                    break;
                case 2:
                    System.out.println("Nhap ten lop muon sua");
                    String className = sc.nextLine();
                    int choiceEdit = -1;
                    while (choiceEdit !=0){
                        System.out.println("Nhap lua chon edit");
                        choiceEdit = sc.nextInt();
                        sc.nextLine();
                        switch (choiceEdit){
                            case 1:
                                Student student = new Student("001","thanh","20",true,"HN",8.3);
                                school.edit(school.findClass(className),student);
                                break;
                            case 2:
                                System.out.println("Nhap ma sinh vien muon sua vao day");
                                String code = sc.nextLine();



                            default:
                                break;

                        }
                    }
                    break;

                case 3:
                    System.out.println("case 3");
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }





    }
}

import java.util.*;
import java.util.HashMap;

public class StudentmanagmentClass {
    public static class Student {
        int id ;
        int age;
        String name;
        HashSet<String> courses = new HashSet<>();
        public Student(int id, int age, String name) {

            this.id = id;
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
        }
    }
    public static class University{
        HashMap<Integer,Student> hp = new HashMap<>();
        void addStudent(Student s ){
            if(hp.containsKey(s.id)){
                System.out.println("id already exist");
            }else{
            hp.put(s.id,s);
            System.out.println("added");
        }}
        void studentInfo(Integer id){
            if(hp.get(id)!= null){
            System.out.println(hp.get(id));
            }else {
                System.out.println("No sush id");
            }
        }
        void delStudent(Integer id){

            if(hp.remove(id) !=null){ System.out.println("deleted");}else {
                System.out.println("no such id");
            };
        }
        void updateInfo(Integer id,int new_age){
            if(hp.get(id)!=null){
            hp.get(id).age = new_age;
            System.out.println("changed");
        }}
        void updateInfo(Integer id, String name){
            if(hp.get(id)!=null){
            hp.get(id).name = name;
            System.out.println("changed");
        }}
        void updateInfo(Integer id,HashSet set){
            if(hp.get(id)!=null){
            hp.get(id).courses = set;
            System.out.println("changed");
        }}
        void updateAllInfo(Integer id,String name,Integer age,HashSet set){
            if(hp.get(id)!=null){
            hp.get(id).courses = set;
            hp.get(id).name = name;
            hp.get(id).age = age;
            System.out.println("changed");
        }}
        void displayAllStudents() {
            TreeMap<Integer, Student> sortedMap = new TreeMap<>(hp);
            for (Map.Entry<Integer, Student> entry : sortedMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
        void searchByCourse(String course){
            for (Student s :hp.values()){
                if (s.courses.contains(course)){
                    System.out.println(s.name+"\n");
                }
            }

        }

    }
    public static void main(String[] args) {
        University university = new University();

        HashSet<String> courses1 = new HashSet<>(Arrays.asList("Math", "Physics"));

        Student student1 = new Student(1,18,"Kanybek")

        student1.courses.addAll(courses1);

        university.addStudent(student1);
        // Демонстрация работы системы
        System.out.println("All students:");
        university.displayAllStudents();

        System.out.println("\nSearching for students enrolled in 'Math':");
        university.searchByCourse("Math");

        System.out.println("\nUpdating student info:");
        university.updateInfo(1, 25);
        university.displayAllStudents();
    }

}

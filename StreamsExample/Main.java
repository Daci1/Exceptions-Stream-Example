package StreamsExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    //operatii: terminale si neterminale
    //terminale: nu mai fac operatii pe stream si returnez produsul final
    //operatii neterminale: returneaza mereu un Stream, si sunt de obicei: map, filter, sort, reduce
    public static void main(String[] args) {
        List<Student> generatedStudents = StudentsGenerator.generateRandomStudents(10);

        System.out.println(generatedStudents);
//        System.out.println(getStudentsAge(generatedStudents));
//        System.out.println(getStudentsNameByAge(generatedStudents));
        System.out.println(getStudentNameWithHighestMeanGrade(generatedStudents));
//        System.out.println(countStudentiRestantieri(generatedStudents));
//        System.out.println(getAverageGradeForStudents(generatedStudents));
    }

    public static List<Integer> getStudentsAge(List<Student> students){
        return students.stream()
                //.map((student) -> student.getAge())
                .map(Student::getAge)
                .collect(Collectors.toList());
    }

    public static Map<Integer, List<Student>> getStudentsNameByAge(List<Student> students){
        return students
                .stream()
                .collect(
                        Collectors.groupingBy(Student::getAge, Collectors.toList())
                );
    }

    public static String getStudentNameWithHighestMeanGrade(List<Student> students){
        return students.stream()
                .sorted((student1, student2) -> student1.getMeanGrade().compareTo(student2.getMeanGrade())) // sorteaza dupa medie
                .skip(students.size() - 1)
                .map((student) -> {
                    String aux = student.getFirstName() + " " ;
                    aux += student.getLastName() + " ";
                    aux += + student.getMeanGrade();
                    return aux;
                })
                .collect(
                        Collectors.joining(", ")
                );
    }

    public static Integer countStudentiRestantieri(List<Student> students){
        return (int) students.stream()
                .filter(student -> student.getMeanGrade() < 4.5)
                .count();
    }

    public static Double getAverageGradeForStudents(List<Student> students){
        return students.stream()
                .mapToDouble(student -> student.getMeanGrade())
                .average()
                .orElse(0.0);
    }


}

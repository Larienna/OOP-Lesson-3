package Task2;

import java.util.Scanner;

/*
Using IntelliJ IDEA, create a project. Necessary:

Create a class that represents the ClassRoom.ClassRoom training class.
Create a pupil class ClassRoom.Pupil. In the body of the class, create methods void study(), void read(), void write(), void relax().
Create 3 derived classes ClassRoom.ExcellentPupil, ClassRoom.GoodPupil, ClassRoom.BadPupil from the ClassRoom.Pupil base class and override each of the methods depending on the student's performance.
The constructor of the ClassRoom.ClassRoom class takes arguments of type ClassRoom.Pupil, the class must consist of 4 students.
Allow for the possibility that the user may pass 2 or 3 arguments.
Display information about how all students of the ClassRoom.ClassRoom instance learn, read, write, rest.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the excellent pupil: ");
        String excellentName = scanner.nextLine();
        ExcellentPupil excellentPupil = new ExcellentPupil();
        excellentPupil.setName(excellentName);

        System.out.print("Enter the name of the good pupil: ");
        String goodName = scanner.nextLine();
        GoodPupil goodPupil = new GoodPupil();
        goodPupil.setName(goodName);

        System.out.print("Enter the name of the bad pupil: ");
        String badName = scanner.nextLine();
        BadPupil badPupil = new BadPupil();
        badPupil.setName(badName);

        ClassRoom classRoom1 = new ClassRoom(excellentPupil, goodPupil, badPupil);
        System.out.println("\nExcellent, Good and Bad ClassRoom.Pupil says: ");
        classRoom1.study();
        classRoom1.relax();
        classRoom1.write();
        classRoom1.read();

        ClassRoom classRoom2 = new ClassRoom(excellentPupil, goodPupil);
        System.out.println("\nExcellent and Good ClassRoom.Pupil says: ");
        classRoom2.study();
        classRoom2.relax();
        classRoom2.write();
        classRoom2.read();

        ClassRoom classRoom3 = new ClassRoom(excellentPupil, goodPupil, badPupil, excellentPupil);
        System.out.println("\nExcellent, Good, Bad and Excellent ClassRoom.Pupil says: ");
        classRoom3.study();
        classRoom3.relax();
        classRoom3.write();
        classRoom3.read();
    }
}
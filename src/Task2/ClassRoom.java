package Task2;

public class ClassRoom {
    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    public void study() {
        System.out.println("====Study====");
        pupil1.study();
        if (pupil2 != null) {
            pupil2.study();
        }
        if (pupil3 != null) {
            pupil3.study();
        }
        if (pupil4 != null) {
            pupil4.study();
        }
    }

    public void read() {
        System.out.println("====Read====");
        pupil1.read();
        if (pupil2 != null) {
            pupil2.read();
        }
        if (pupil3 != null) {
            pupil3.read();
        }
        if (pupil4 != null) {
            pupil4.read();
        }
    }

    public void write() {
        System.out.println("====Write====");
        pupil1.write();
        if (pupil2 != null) {
            pupil2.write();
        }
        if (pupil3 != null) {
            pupil3.write();
        }
        if (pupil4 != null) {
            pupil4.write();
        }
    }

    public void relax() {
        System.out.println("====Relax====");
        pupil1.relax();
        if (pupil2 != null) {
            pupil2.relax();
        }
        if (pupil3 != null) {
            pupil3.relax();
        }
        if (pupil4 != null) {
            pupil4.relax();
        }
    }
}

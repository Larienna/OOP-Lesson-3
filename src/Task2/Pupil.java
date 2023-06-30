package Task2;

class Pupil {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void study() {
    }

    void read() {
    }

    void write() {
    }

    void relax() {
    }
}

//Class for Excellent ClassRoom.Pupil
class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println(getName() + ": I study very Hard");
    }

    @Override
    void read() {
        System.out.println(getName() + ": I read a lot");
    }

    @Override
    void write() {
        System.out.println(getName() + ": I write all conspectus");
    }

    @Override
    void relax() {
        System.out.println(getName() + ": I can`t relax");
    }
}

// Good student class
class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println(getName() + ": I study well");
    }

    @Override
    void read() {
        System.out.println(getName() + ": I like reading books");
    }

    @Override
    void write() {
        System.out.println(getName() + ": I write conspectus, but not always");
    }

    @Override
    void relax() {
        System.out.println(getName() + ": I relax by listening to music");
    }


}

// Bad student class
class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println(getName() + ": I dont like studying");
    }

    @Override
    void read() {
        System.out.println(getName() + ": I dont like reading books");
    }

    @Override
    void write() {
        System.out.println(getName() + ": I didn't write conspectus");
    }

    @Override
    void relax() {
        System.out.println(getName() + ": I relax by playing games");
    }
}


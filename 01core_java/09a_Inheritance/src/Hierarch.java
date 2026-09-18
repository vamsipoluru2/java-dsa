//extending multiple child classes for single parent class
class College {
    void collegeInfo() {
        System.out.println("Engineering College");
    }
}

class CSE extends College {
    void deptInfo() {
        System.out.println("Department: Computer Science & Engineering");
    }
}

class ECE extends College {
    void deptInfo() {
        System.out.println("Department: Electronics & Communication Engineering");
    }
}

class MECH extends College {
    void deptInfo() {
        System.out.println("Department: Mechanical Engineering");
    }
}

// Main class
public class Hierarch {
    public static void main(String[] args) {
        CSE cseDept = new CSE();
        cseDept.collegeInfo();
        cseDept.deptInfo();

        ECE eceDept = new ECE();
        eceDept.collegeInfo();
        eceDept.deptInfo();

        MECH mechDept = new MECH();
        mechDept.collegeInfo();
        mechDept.deptInfo();
    }
}

package Employee;

public class Employee {
    String name;
    double salary;
    int hireYear;
    double workHours;

    Employee(String name, double salary, int hireYear, double workHours) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;

    }

    double tax() {
        double tax = 0;
        if (this.salary < 1000) {
            return tax;
        } else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    double bonus() {
        double bonus = 0;
        if (this.workHours < 40) {
            return bonus;
        } else {
            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
    }

    double raiseSalary() {
        double raiseSalary = 0;
        if ((2023 - this.hireYear) <= 9) {
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        } else if ((2023 - this.hireYear) > 9 && (2023 - this.hireYear) <= 19) {
            raiseSalary = this.salary * 0.1;
            return raiseSalary;
        } else {
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
    }


    public String toString() {
        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Çalışma Saati:" + this.workHours);
        System.out.println("İşe Giriş Tarihi:" + this.hireYear);
        System.out.println("Vergi:" + this.tax());
        System.out.println("Bonus:" + this.bonus());
        System.out.println("Maaş Artışı:" + this.raiseSalary());
        System.out.println("Vergiler ve Bonus ile Toplam Maaş:" + (this.salary + this.bonus() - this.tax()));

        return null;
    }
}

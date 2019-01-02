package design;

public abstract class AbstractEmployee implements Employee{
    public int vacationDays;
    public int sickDays;

    public int holidaysLeaves;
    public int bonusPaidLeave;

    public int getVacationDays() {
        return vacationDays;
    }

    public int getSickDays() {
        return sickDays;
    }

    public int getHolidaysLeaves() {
        return holidaysLeaves;
    }

    public int getBonusPaidLeave() {
        return bonusPaidLeave;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public void setHolidaysLeaves(int holidaysLeaves) {
        this.holidaysLeaves = holidaysLeaves;
    }

    public void setBonusPaidLeave(int bonusPaidLeave) {
        this.bonusPaidLeave = bonusPaidLeave;
    }




}

package employ;

import java.text.DecimalFormat;

public class Employee {

    private Integer PersonnelNumber;
    private String name;
    private String telephoneNumber;
    private String experience;

    public Employee(Integer personnelNumber, String name, String telephoneNumber, String experience) {
        PersonnelNumber = personnelNumber;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.experience = setExperience(experience);
    }
    public String setExperience(String experience) {
        String[] parts = experience.split("\\.");
        return this.experience = parts[0] + " лет, " + parts[1] + " мес, " + parts[2] + " дней";

    }
    public Integer getPersonnelNumber() {
        return PersonnelNumber;
    }

    public void setPersonnelNumber(Integer personnelNumber) {
        PersonnelNumber = personnelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getExperience() {
        return experience;
    }



    @Override
    public String toString() {
        return "{" +
                "PersonnelNumber=" + PersonnelNumber +
                "name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", experience= " + experience +
                '}' + "\n";
    }
    public String year(Double experience){
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String years = decimalFormat.format(experience);
        return years;
    }
    public String month(Double experience){

        String month = String.valueOf(experience).replaceAll("^\\d*\\.","");
        return month;

    }
}

/*
Author: Caleb Landry
Program: Cosc1200
Date: 7/24/2024
 */

package Assignment3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.time.LocalDate;


public class Assignment3 {
    public static void main(String[] args) {

        Vaccine vaccine = new Vaccine();
        vaccine.displayVaccineDetails();

        Vaccine vaccine1 = new Vaccine(3245, "Pfizer", 0.03, 25, Calendar.getInstance(), true);
        Vaccine vaccine2 = new Vaccine(2257, "bullet", 0.05, 21, Calendar.getInstance(), true);
        Vaccine vaccine3 = new Vaccine(9312, "coma", 0.09, 4900, Calendar.getInstance(), true);

        List<Vaccine> vaccines = new ArrayList<Vaccine>();

        vaccines.add(vaccine1);
        vaccines.add(vaccine2);
        vaccines.add(vaccine3);

        for (Vaccine v : vaccines) {
            v.displayVaccineDetails();
        }

    }

    public static class Vaccine{

        //Private data-members
        private int vaccineID;
        private String vaccineName;
        private double vaccinePrice;
        private int unitsAvailable;
        private Calendar vaccineDate;
        private boolean listOrder;

        //public data-members
        public int getVaccineID() {
            return vaccineID;
        }

        public void setVaccineID(int vaccineID) {
            this.vaccineID = vaccineID;
        }

        public String getVaccineName() {
            return vaccineName;
        }

        public void setVaccineName(String vaccineName) {
            this.vaccineName = vaccineName;
        }

        public double getVaccinePrice() {
            return vaccinePrice;
        }

        public void setVaccinePrice(double vaccinePrice) {
            this.vaccinePrice = vaccinePrice;
        }

        public int getUnitsAvailable() {
            return unitsAvailable;
        }

        public void setUnitsAvailable(int unitsAvailable) {
            this.unitsAvailable = unitsAvailable;
        }

        public Calendar getVaccineDate() {
            return vaccineDate;
        }

        public void setVaccineDate(Calendar vaccineDate) {
            this.vaccineDate = vaccineDate;
        }

        public boolean isListOrder() {
            return listOrder;
        }

        public void setListOrder(boolean listOrder) {
            this.listOrder = listOrder;
        }


        public Vaccine() {
            this.vaccineID = 0;
            this.vaccineName = "Name";
            this.vaccinePrice = 0.01;
            this.unitsAvailable = 20;
            this.vaccineDate = null;
            this.listOrder = false;
        }

        public Vaccine(int vaccineID, String vaccineName, double vaccinePrice, int unitsAvailable, Calendar vaccineDate, boolean listOrder) {
            this.vaccineID = vaccineID;
            this.vaccineName = vaccineName;
            this.vaccinePrice = vaccinePrice;
            this.unitsAvailable = unitsAvailable;
            this.vaccineDate = vaccineDate;
            this.listOrder = true;
        }

        public void displayVaccineDetails() {
            if (listOrder) {
                System.out.println("SKU:" + vaccineID + "| Vaccine Name:" + vaccineName + "| Unit Cost:" + vaccinePrice + "| QTY:" + unitsAvailable + "| Expiry:" + vaccineDate);
            } else {
                System.out.println("SKU:" + vaccineID);
                System.out.println("Vaccine Name:" + vaccineName);
                System.out.println("Unit Cost:" + vaccinePrice);
                System.out.println("Quantity on hand:" + unitsAvailable);
                System.out.println("Expiry Date:" + vaccineDate);
            }
        }


    }
}

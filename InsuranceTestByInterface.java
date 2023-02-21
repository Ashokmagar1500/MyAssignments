public class InsuranceTestByInterface {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.pickup();
        insurance.waitForApproval();
        insurance.howMuch();
        insurance.paidFees();
        System.out.println("........................");

        HealthInsurance healthIn = new HealthInsurance();
        healthIn.researchDifferent();
        healthIn.pickup();
        healthIn.fillOutApplication();
        healthIn.waitForApproval();
        healthIn.howMuch();
        healthIn.paidFees();
        System.out.println("......................");

        lifeInsurance lifeIn = new lifeInsurance();
        lifeIn.pickup();
        lifeIn.waitForApproval();
        lifeIn.howMuch();
        lifeIn.checkUpHealth();
        lifeIn.paidFees();
        System.out.println("......................");

        AutoMobileInsurance autoIn = new AutoMobileInsurance();
        autoIn.pickup();
        autoIn.howMuch();
        autoIn.paidFees();
        System.out.println(".....................");

        HomeInsurance homeInsurance = new HomeInsurance();
        homeInsurance.makeYears();
        homeInsurance.pickup();
        homeInsurance.waitForApproval();
        homeInsurance.howMuch();
        homeInsurance.paidFees();
        System.out.println("........................");

    }
}
interface decide{
 void howMuch();
}
interface pick{
    void pickup();
}
interface research{
    void researchDifferent();
}
interface fillOut{
    void fillOutApplication();

}
interface approval{
    void waitForApproval();
}
interface paid {
    void paidFees();
}
interface checkHealth{
    void checkUpHealth();
}
interface typesOfCar{
    void Made();
}
interface makeYear{
    void makeYears();
}
class Insurance implements decide,pick,approval,paid {

    @Override
    public void howMuch() {
        System.out.println("Decide how much money should we pay for insurance.");

    }

    @Override
    public void pickup() {
        System.out.println("Decide which insurance policy should we pick.");
    }

    @Override
    public void waitForApproval() {
        System.out.println("wait for insurance approval");
    }

    @Override
    public void paidFees() {
        System.out.println("paid insurance fees.");
    }
}
class HealthInsurance extends Insurance implements research, fillOut {

    @Override
    public void researchDifferent() {
        System.out.println("research different types of insurance");
    }

    @Override
    public void fillOutApplication() {
        System.out.println("fill out application for the insurance.");
    }
}

class lifeInsurance extends Insurance implements checkHealth {

    @Override
    public void checkUpHealth() {
        System.out.println("check up health status for life insurance approval.");
    }
}

class AutoMobileInsurance extends Insurance implements typesOfCar {

    @Override
    public void Made() {
        System.out.println("define the car made by");
    }
}
class HomeInsurance extends Insurance implements makeYear {

    @Override
    public void makeYears() {
        System.out.println("define the house make year.");
    }
}

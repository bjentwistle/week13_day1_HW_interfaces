import java.util.ArrayList;

public class Wallet {

    private final ArrayList<IChargeable> chargeables = new ArrayList<>();
    private IChargeable selectedChargeable;

    public void addNewCard(IChargeable chargeable){
        chargeables.add(chargeable);
    }

    public void setSelectedChargeable(int index){
        selectedChargeable =  chargeables.get(index);
    }

    public Boolean isSelectedChargeable(IChargeable chargeableArg){
        return selectedChargeable == chargeableArg;
    }

    public int getNumChargeables(){
        return  chargeables.size();
    }

    public double payWithSelectedChargeable(double amount) {//this uses the Class of the selectedChargeable
        return selectedChargeable.charge(amount); //polymorphism example
    }

}

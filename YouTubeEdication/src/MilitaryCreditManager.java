
public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {

        System.out.println("Asker Kredisi hesapland─▒.");
    }

    @Override
    public void save() {
        System.out.println("--- Asker Kaydedildi ---");
    }
}

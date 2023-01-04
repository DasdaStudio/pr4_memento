import java.util.*;

public class CareTaker {
    protected List<Stats> mementoList = new ArrayList<>();
    static int saveId = 0;

    protected void add(Stats state){
        mementoList.add(state);
        System.out.println("\nStats saved. Save id: " + saveId);
        System.out.println();
        saveId++;
    }

    protected Stats get(int index){
        System.out.println("\nLoading from save id" + index + "...");
        return mementoList.get(index);
    }
}

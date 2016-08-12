package bug_4;

public class StrangeBehavior {
    private StrangeBehavior strangeBehavior ;
    /* необходимо было удалить = new StrangeBehavior(), так как поля класса идут раньше чем создание конструктора, а у нас в поле
    сразу использовали конструктор, и он снова бы шел в поля, а потом конструктор, а потом поля - в общем, до бесконечности и далее
     */

    public static void main(String[] args) {
        new StrangeBehavior();
    }
}


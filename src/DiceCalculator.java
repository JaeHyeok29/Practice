
public class DiceCalculator {

    public static int addDice(Dice first, Dice second) {
        return first.getNumber() + second.getNumber();
    }

    public static int subDice(Dice first, Dice second) {
        return first.getNumber() - second.getNumber();
    }

    public static int mulDice(Dice first, Dice second) {
        return first.getNumber() * second.getNumber();
    }

    public static int divDice(Dice first, Dice second) {
        return first.getNumber() / second.getNumber();
    }

    /*    public static int divDice(Dice first, Dice second) {
        if (second.getNumber() == 0) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
            return 0;
        } */

    public static boolean isOdd(Dice dice) {
        return dice.getNumber() %2 != 0; // a랑 b가 같으면 false 다르면 true
    }

    public static boolean isEven(Dice dice) {
        return dice.getNumber() %2 == 0; //  a랑 b가 같으면 true 다르면 false 
    }
}


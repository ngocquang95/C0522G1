package ss20_design_pattern._2_factory_method;

public class BankFactory {
    /**
     * @param type = 1 => TPBANK, 2 => VietcomBank
     * @return
     */
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                return null;
        }
    }
}

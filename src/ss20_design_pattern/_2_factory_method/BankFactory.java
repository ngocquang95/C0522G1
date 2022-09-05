package ss20_design_pattern._2_factory_method;

public class BankFactory {
    /**
     *
     * @param bankType
     * @return Bank
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

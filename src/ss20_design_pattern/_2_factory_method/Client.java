package ss20_design_pattern._2_factory_method;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);// Tạo đối tượng kiểu TPBANK
        Bank bank1 = BankFactory.getBank(BankType.VIETCOMBANK);// Tạo đối tượng kiểu Vietcombank

        System.out.println(bank.getBankName());
        System.out.println(bank1.getBankName());
    }
}

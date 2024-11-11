import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount(new Person("John", "Edwards", "john@email.com","GB009898674544579", 10000000.0 ),
                new BankAccount(new Person("Marie", "Stepchens", "marie@email.com","KJ009898674544579", 60000.0 ),
                new BankAccount(new Person("Schawna", "Will", "schawna@email.com","OL009898674544579", 97654.0 )));
        Map<Person, Double> PersonBalansMap = accounts.stream()
                .collect(Collectors.toMap(BankAccount::getOwner, BankAccount::getBalans));
        Map<String,Person> ibanOwnerMap = accounts.stream()
                .collect(Collectors.toMap(BankAccount::getIBAN, BankAccount::getOwner));

        Map<String, String> ibanShortMap = accounts.stream()
                .collect(Collectors.toMap(BankAccount::getIBAN, account -> account.getOwner().getfName().substring(0, 1)+ "."+account.getOwner().getLName()
                ));
        System.out.println("Map: person - balance ");
        System.out.println("Map: IBAN -  person");
        System.out.println("Map: IBAN- Scort Name ");


    }
}

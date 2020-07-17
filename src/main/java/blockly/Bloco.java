package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Bloco
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.database.Operations.executeProcedure(
    Var.valueOf("app"),
    Var.valueOf("Busca2"),
    cronapi.list.Operations.newList(
    Var.valueOf("2446125d-abeb-4d14-a630-422eecf18da6")),
    Var.VAR_NULL);

    System.out.println(item.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}


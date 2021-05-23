package user;

import org.junit.jupiter.api.Test;
import java.util.Scanner;


class UserTest{
    Command showCommand = new ShowCommand();
    showCommand.execute();
    @Test
    void testEdit(){
        Command deleteCommand = new DeleteCommand();
        editCommand.execute();
    }

    @Test
    void testDelete(){
        Command editCommand = new EditCommand();
        deleteCommand.execute();
    }

}
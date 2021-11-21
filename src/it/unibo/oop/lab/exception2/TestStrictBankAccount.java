package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */
        final StrictBankAccount a1 = new StrictBankAccount(1, 10000, 10);
        final StrictBankAccount a2 = new StrictBankAccount(2, 10000, 10);
         /* 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
        a1.deposit(1, 20);
        a2.deposit(1, 20);
        a1.withdrawFromATM(1, 50000);
        a2.withdrawFromATM(2, 50);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
        a1.depositFromATM(1, 10);
    }
}

package day052.warmup;

public interface Transferable {
    public abstract void transferAll(Account otherAccount);
    public abstract void transferAmount(Account otherAccount,int balance);
}

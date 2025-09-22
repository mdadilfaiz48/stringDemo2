final public class ImmutableExample {

    private int i;
    ImmutableExample(int i){
        this.i = this.i;
    }

    public ImmutableExample modify(int i){
        if(this.i ==  i){
            return this;
        }
        else{
            return new ImmutableExample(i);
        }
    }
}

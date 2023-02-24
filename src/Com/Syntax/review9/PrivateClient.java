package Com.Syntax.review9;

public class PrivateClient {  // encapsulation with constructor

    private String name;
    private long ssn;

    PrivateClient(String name, long ssn) {
        if (name!=null && !name.isEmpty()){
            this.name = name;
        }
        if (ssn!=0) {
            this.ssn=ssn;
        }
    }
    public String getName () {
        return name;
    }

    public long getSsn() {
        return ssn;
    }
}

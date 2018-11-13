package Counter;

public class Counter {
    int number;


    public Counter() {
        number = 0;

    }

    public Counter(int number) {
        this.number = number;
    }

    public void add(int i){
        number += i;
    }

    public void add(){number += 1;}

    public void get(){ System.out.println(number);
    }

    public void reset(){ number=0;
    }


}


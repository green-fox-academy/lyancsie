package Counter;

public class Counter {
    int numberOriginal;
    int number;


    public Counter() {
        number = 0;
        numberOriginal = number;
    }

    public Counter(int number) {
        this.number = number;
        numberOriginal = number;
    }

    public void add(int i){
        number += i;
    }

    public void add(){number += 1;}

    public void get(){ System.out.println(number);
    }

    public void reset(){ number=numberOriginal;
    }


}


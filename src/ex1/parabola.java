package ex1;

class Variabila {
    private final int a;
    private final int b;
    private final int c;
    public int x1,y1;
    public Variabila(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;

    }
        public String toString() {
            return "f(x)" + "=" + a + "x^2" + "+" + b + "x" + "+" + c;
        }

        public int get()
        {
            return a;
        }
        public int get1()
         {
          return b;
         }
        public int get2()
        {
         return a;
        }

        public  void Vf(Variabila p)
        {
            int x1,y1;
            x1= -(p.get1()/2*p.get());
            y1= (-p.get1()*p.get1()+4*p.get() *p.get2())/4*p.get();
            System.out.println("Varful parabolei este:" + x1 + "," +y1);
        }



}

public class StaticMethod {
	static int n1;
    static int m;
    
    static void f1(int x) { n1 = x; }
    void f2(int x) { m = x; }

    static void s1(int x) { n1 = x; } 
    static void s2(int x) { f1(3); }

    static void s3(int x) { m = x; } 
    static void s4(int x) { s3(3); }   
}

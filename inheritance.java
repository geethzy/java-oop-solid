interface inter{
    int add(int a, int b);
    int sub(int a, int b);
}

interface hnter{
    int div(int a, int b);
    int mul(int a, int b);
}

abstract class absme{
    abstract int div(int a, int b);
    abstract int mul(int a, int b);
}

class Shape implements inter{

    @Override
    public int add(int a, int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int sub(int a, int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

}



// class absme{
//     int div(int a, int b){
//         return a/b;
//     }
//     int mul(int a, int b){
//         return a*b;
//     }
// }

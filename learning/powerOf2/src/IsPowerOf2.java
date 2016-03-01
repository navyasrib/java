public class IsPowerOf2 {

    public IsPowerOf2() {}

    public boolean number(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder bits = new StringBuilder();
        bits.append(binary);
        bits = bits.reverse();
        int decimal = Integer.parseInt(String.valueOf(bits),2);
        return (decimal==1)? true:false;
    }
}

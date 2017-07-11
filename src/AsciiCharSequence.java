/**
 * Created by ihgorek on 7/10/17.
 */
public class AsciiCharSequence
    implements CharSequence{
    private byte[] data;
    public  AsciiCharSequence(byte[] data){
        this.data=data;
    }
    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) data[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] now = new byte[end-start];
        for (int i = 0, j = start; i < end-start; i++, j++){
            now[i] = data[start+i];
        }
        return new AsciiCharSequence(now);
    }

    @Override
    public String toString() {
        return new String(data);
    }
}

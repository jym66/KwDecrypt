import java.util.Arrays;

public final class b {

    private static final char[] f8944b = new char[64];

    private static final byte[] f8945c = new byte[128];

    static {
        char c2 = 'A';
        int i = 0;
        while (c2 <= 'Z') {
            f8944b[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            f8944b[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            f8944b[i] = c4;
            c4 = (char) (c4 + 1);
            i++;
        }
        f8944b[i] = '+';
        f8944b[i + 1] = '/';
        Arrays.fill(f8945c, (byte) -1);
        for (int i3 = 0; i3 < 64; i3++) {
            f8945c[f8944b[i3]] = (byte) i3;
        }
    }




    public static char[] a(byte[] bArr, int i) {
        return a(bArr, i,  null);
    }

    public static char[] a(byte[] bArr, int i, String str) {
        int i2;
        int b2;
        int i3;
        int b3;
        int i4;
        if (str != null && !str.equals("")) {
            byte[] bytes = str.getBytes();
            for (int i5 = 0; i5 < bArr.length; i5 = i4) {
                i4 = i5;
                int i6 = 0;
                while (i6 < bytes.length && i4 < bArr.length) {
                    bArr[i4] = (byte) (bArr[i4] ^ bytes[i6]);
                    i6++;
                    i4++;
                }
            }
        }
        int i7 = ((i * 4) + 2) / 3;
        char[] cArr = new char[(((i + 2) / 3) * 4)];
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            int i10 = i8 + 1;
            int b4 = bArr[i8] & 255;
            if (i10 < i) {
                i2 = i10 + 1;
                b2 = bArr[i10] & 255;
            } else {
                i2 = i10;
                b2 = 0;
            }
            if (i2 < i) {
                i3 = i2 + 1;
                b3 = bArr[i2] & 255;
            } else {
                i3 = i2;
                b3 = 0;
            }
            int i11 = b4 >>> 2;
            int i12 = ((b4 & 3) << 4) | (b2 >>> 4);
            int i13 = ((b2 & 15) << 2) | (b3 >>> 6);
            int b5 = b3 & 63;
            int i14 = i9 + 1;
            cArr[i9] = f8944b[i11];
            int i15 = i14 + 1;
            cArr[i14] = f8944b[i12];
            char c2 = '=';
            cArr[i15] = i15 < i7 ? f8944b[i13] : '=';
            int i16 = i15 + 1;
            if (i16 < i7) {
                c2 = f8944b[b5];
            }
            cArr[i16] = c2;
            i9 = i16 + 1;
            i8 = i3;
        }
        return cArr;

    }

}
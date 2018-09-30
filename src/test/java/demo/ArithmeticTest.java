package demo;

import org.junit.Ignore;
import org.junit.Test;

public class ArithmeticTest {

    Arithmetic arithmetic = new Arithmetic();

    @Test
    public void testLength() {
        assert arithmetic.getLength(null) == 0;
        assert arithmetic.getLength("ab") == 2;
        assert arithmetic.getLength("ab中") == 3;
    }

    @Test
    public void testRot13() {
        assert "Uryyb".equals(arithmetic.rot13("Hello"));
        assert "FgevatHgvy".equals(arithmetic.rot13("StringUtil"));
        assert "Fg22evat中文Hgvy".equals(arithmetic.rot13("St22ring中文Util"));
        assert arithmetic.rot13(null) == null;
    }

    @Test
    public void testReverse() {
        assert "olleh".equals(arithmetic.reverse("hello"));
        assert "123".equals(arithmetic.reverse("321"));
        assert arithmetic.reverse(null) == null;
    }

    @Test
    public void testIsEmpty() {
        assert arithmetic.isEmpty("");
        assert arithmetic.isEmpty(null);
        assert arithmetic.isEmpty("       ");
        assert arithmetic.isEmpty("null");
        assert !arithmetic.isEmpty("hello");
        assert !arithmetic.isEmpty("123  ");
    }

    @Test
    public void testFirstNotDupCharOfString () {
        assert arithmetic.firstNotDupCharOfString2("hello") == 'h';
        assert arithmetic.firstNotDupCharOfString2("hello, how r you") == 'e';
        assert arithmetic.firstNotDupCharOfString2("he232hllo") == 'e';
        assert arithmetic.firstNotDupCharOfString2("h5e232hllo") == '5';
        assert arithmetic.firstNotDupCharOfString2("h你e232hllo") == '你';
        assert arithmetic.firstNotDupCharOfString2("") == 0;
        assert arithmetic.firstNotDupCharOfString2(null) == 0;
        assert arithmetic.firstNotDupCharOfString2("rrrrrrr") == 0;
    }


    @Test @Ignore
    public void testFirstNotDupCharOfStringTime() {
        // 1. 构造一个非常非常大的随机字符串
        String str = arithmetic.randStr(111111111);

        // 2. 计算，调用 ... 执行时间
        long start = System.currentTimeMillis();

        arithmetic.firstNotDupCharOfString2(str);

        System.out.println(System.currentTimeMillis() - start);
    }


    @Test
    public void testRandStr() {
        String s1 = arithmetic.randStr(6);
        assert s1.length() == 6;

        String s2 = arithmetic.randStr(6);
        assert s2.length() == 6;

        assert !s1.equals(s2);
    }
}
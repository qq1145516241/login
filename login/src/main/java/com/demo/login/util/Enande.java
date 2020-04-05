package com.demo.login.util;

public class Enande {
    /**
     * @param sourceString
     * @return 密文
     */
    public static String encrypt(String sourceString) {
        char[] c = sourceString.toCharArray();
        int m = c.length; // 字符串长度
        for (int k = 0; k < m; k++) {
            int mima = c[k] + 5; // 加密
            c[k] = (char) mima;
        }
        return new String(c);
    }

    /**
     *
     * @param sourceString
     * @return 明文
     */
    public static String decrypt(String sourceString) {
        char[] c = sourceString.toCharArray();
        int m = c.length; // 字符串长度
        for (int k = 0; k < m; k++) {
            int mima = c[k] - 5; // 解密
            c[k] = (char) mima;
        }
        return new String(c);
    }

    /*
     * 使用例子
     */
    public static void main(String arg[]) {
        String wen = "这是一段明文";
        String pass = "123456789";
        System.out.println(encrypt(wen));
        System.out.println(decrypt(encrypt(wen)));
    }
}

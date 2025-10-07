package com.Pranjal.Day52;

public class PublicPrivate {

    private int secret = 123;
    public int visible = 456;

    public static void main(String[] args) {
        PublicPrivate obj = new PublicPrivate();
        System.out.println("Public: " + obj.visible);
        System.out.println("Private: " + obj.secret);
    }

    public int getSecret() {
        return secret;
    }
}

class Test {
    public static void main(String[] args) {
        PublicPrivate e = new PublicPrivate();
        System.out.println("Public: " + e.visible);
        System.out.println("Private via method: " + e.getSecret());
    }
}
